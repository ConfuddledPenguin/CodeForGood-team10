package cfg.team10.algorithm;
 
import cfg.team10.model.m_Status;
import cfg.team10.model.m_clientImp;
import cfg.team10.model.m_loanImp;
import cfg.team10.model.m_clientImp.Gender;
 
 
public class Algorithm {
     
    private Boolean reject = false;
    private Boolean paidOnTime = false;
    private m_clientImp client;
    private m_loanImp loan;
 
 
    public Algorithm(m_clientImp client, m_loanImp loan){
        this.client = client;
        this.loan = loan;
        returnRating();
    }
     
    public double returnRating(){
        Boolean reject = false;
        double pScore = 0;
        double fScore = 0;
         
        //end of variables to be created by database
        pScore = personalScore();
        if(!reject){
            fScore = financialScore(reject);
        }
        double rating = pScore+fScore;
        if(reject){
            rating = 20;
        }
        System.out.println(rating);
        return rating;
    }
     
     
    private double personalScore(){
        Gender gender = client.getGender();
         
        double personalScore = 0.0;
 
        if(gender == Gender.Male) {
            personalScore = personalScore + 5;
        }
         
        return personalScore;
    }
     
    private double financialScore(Boolean reject){
        //These will be initialised with getters accessing the database.
        m_Status loan_status = loan.getStatus();
        Double principle = loan.getPrincible_amount();
        Double savingsBalance = 0.0;//sql
         
        //Loan status counts for 25% of their recommendation
        double status = 0.0;
        
         
        if(principle<10000.00){
            status=+ 15;
        } else if(principle<25000.00){
            status =+ 9;
        }
        else{
            status =+ 3;
        }   
         
        if( !loan.getOutstandingLoan()) {
            status = status + 10;
        }
         
        if(loan.getPaiedOnTime()) {
            status = status + 25;
        }
         
        if(loan.getSavingsBalance() > principle) {
            status = status + 5;
        }
        
        if(loan_status == null){
        	return status;
        }
        
        switch(loan_status.getStatus()){
        case m_Status.AWAITING_APROVAL:
                reject = true; //They've already applied for loan and not been approved or rejected yet, shouldn't be applying for another already
         
        case m_Status.APROVED:
                reject = true; //They've just been approved for a loan and haven't even got the money yet/started repayments
        case m_Status.ACTIVE:
                if (paidOnTime){
                    status = status + 12.5;
                }
                else{
                    reject = true;
                }
        case m_Status.WITHDRAWN:
                status = status + 12.5;
        case m_Status.REJECTED:
                status = status + 5;
        case m_Status.CLOSED:
                status = status + 25;
        case m_Status.WRITTEN_OFF:
                reject = true;
        case m_Status.RESCHECDULED:
                status = status + 12.5;
        case m_Status.OVERPAID:
                status = status + 25;
        }
        
        return status;
    }
     
}
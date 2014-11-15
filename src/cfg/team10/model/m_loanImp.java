package cfg.team10.model;
 
 
public class m_loanImp {
     
     
    private m_Status status;
    private double principle_amount;
    private boolean outstandingLoan;
    private boolean paiedOnTime;
    private double savingsBalance;
     
    public m_loanImp( m_Status status, 
                        double principle_amount,
                        boolean outstandingLoan, boolean paidOnTime, double savingsBalance){
     
        this.status = status;
        this.principle_amount = principle_amount;
        this.outstandingLoan = outstandingLoan;
        this.paiedOnTime = paidOnTime;
    }
     
    public m_Status getStatus(){
        return status;
    }
     
    public double getPrincible_amount(){
        return principle_amount;
    }
     
    public boolean getOutstandingLoan(){
        return outstandingLoan;
    }
     
    public boolean getPaiedOnTime(){
        return paiedOnTime;
    }
     
    public double getSavingsBalance(){
        return savingsBalance;
    }
     
     
}
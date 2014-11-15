package cfg.team10.model;
 
 
public class m_loanImp {
     
     
    private int loanID;
    private String account_no;
    private int clientID;
    private m_Status status;
    private double principle_amount;
    private double approved_principle;
    private boolean outstandingLoan;
    private boolean paiedOnTime;
    private double savingsBalance;
     
    public m_loanImp(int loanID, String account_no, int clientID, m_Status status, 
                        double principle_amount, double approved_amount, 
                        boolean outstandingLoan, boolean paidOnTime, double savingsBalance){
     
        this.loanID = loanID;
        this.account_no = account_no;
        this.clientID = clientID;
        this.status = status;
        this.principle_amount = principle_amount;
        this.approved_principle = approved_amount;
        this.outstandingLoan = outstandingLoan;
        this.paiedOnTime = paidOnTime;
    }
     
    public int getLoanID(){
        return loanID;
    }
     
    public String getAccount_no(){
        return account_no;
    }
     
    public int getclientID(){
        return clientID;
    }
     
    public m_Status getStatus(){
        return status;
    }
     
    public double getPrincible_amount(){
        return principle_amount;
    }
     
    public double getApproved_amount(){
        return approved_principle;
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
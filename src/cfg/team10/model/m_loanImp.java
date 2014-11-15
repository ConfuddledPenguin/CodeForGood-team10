package cfg.team10.model;

import java.util.Date;

public class m_loanImp {
	
	
	private int loanID;
	private String account_no;
	private int clientID;
	private m_Status status;
	private double principle_amount;
	private double approved_principle;
	
	
	public m_loanImp(int loanID, String account_no, int clientID, m_Status status, double principle_amount, double approved_amount){
	
		this.loanID = loanID;
		this.account_no = account_no;
		this.clientID = clientID;
		this.status = status;
		this.principle_amount = principle_amount;
		this.approved_principle = approved_amount;
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
	
	
}
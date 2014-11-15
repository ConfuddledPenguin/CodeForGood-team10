package cfg.team10.model;

import javax.rmi.CORBA.Stub;

public class m_Status {
	
	public static final int AWAITING_APROVAL = 100;
	public static final int APROVED = 200;
	public static final int ACTIVE = 300;
	public static final int WITHDRAWN = 400;
	public static final int REJECTED = 500;
	public static final int CLOSED = 600;
	public static final int WRITTEN_OFF = 601;
	public static final int RESCHECDULED = 602;
	public static final int OVERPAID = 700;
	
	private int status;
	
	public m_Status(int status){
		this.status = status;
	}
	
	public int getStatus(){
		return status;
	}
	
	public void setStatus(int status){
		this.status = status;
	}

}

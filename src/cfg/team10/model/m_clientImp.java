package cfg.team10.model;

import java.util.Date;

public class m_clientImp {
	
	public enum Gender{
		Male, Female
	}
	
	private String account_no;
	private String fname;
	private String sname;
	private String displayName;
	private Date DoB;
	private Gender gender;
	
	
	public m_clientImp(String account_no, String fname, String sname, String displayname, Date DoB, Gender gender){
		
		this.account_no = account_no;
		this.fname = fname;
		this.sname = sname;
		this.displayName = displayname;
		this.DoB = DoB;
		this.gender = gender;
	}
	
	
}
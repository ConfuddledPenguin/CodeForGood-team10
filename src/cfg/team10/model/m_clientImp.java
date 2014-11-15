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
	private String phoneNumber;
	
	
	public m_clientImp(String account_no, String fname, String sname, String displayname, Date DoB, Gender gender, String phonNumber){
		
		this.account_no = account_no;
		this.fname = fname;
		this.sname = sname;
		this.displayName = displayname;
		this.DoB = DoB;
		this.gender = gender;
	}
	
	public String getaccount_no(){
		return account_no;
	}
	
	public String getfname(){
		return fname;
	}
	
	public String getsname(){
		return sname;
	}
	
	public String getdisplayname(){
		return displayName;
	}
	
	public Date getDoB(){
		return DoB;
	}
	
	public String getphonenumber(){
		return phoneNumber;
	}
	
	public Gender getGender(){
		return gender;
	}
	
	
	
}
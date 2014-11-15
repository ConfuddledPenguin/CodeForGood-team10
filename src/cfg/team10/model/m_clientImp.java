package cfg.team10.model;
 
 
public class m_clientImp {
     
    public enum Gender{
        Male, Female
    }
     
    private String account_no;
    private Gender gender;
    private String phoneNumber;

     
     
    public m_clientImp(String account_no, Gender gender, String phonNumber){
         
        this.account_no = account_no;
        this.gender = gender;
    }
     
    public String getaccount_no(){
        return account_no;
    }
     
    public String getphonenumber(){
        return phoneNumber;
    }
     
    public Gender getGender(){
        return gender;
    }
     

     
}
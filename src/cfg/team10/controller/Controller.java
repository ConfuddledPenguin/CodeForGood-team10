package cfg.team10.controller;
import java.sql.ResultSet;
import java.sql.SQLException;

import cfg.team10.model.m_clientImp;
import cfg.team10.model.m_clientImp.Gender;
import cfg.team10.userinterface.*;

public class Controller {

	public Controller(){
		
		//create interface
		userInterface ui = new clientGUI();
		
		
	}
	
	public void getUserData(String account_no){
		
		SQLinteraction sql = new SQLinteraction();
		
		String query = 	"SELECT firstname, lastname, displayname, date_of_birth, gender_cv_id" +
						"Where account_no =" + account_no + ";";
		
		ResultSet rs = sql.runQuery(query);
		
		try {
			while(rs.next()){
				
				Gender gender;
				
				if(rs.getInt("gender_cv_id") == 55){
						
					gender = m_clientImp.Gender.Male;
				}else{
					gender = m_clientImp.Gender.Female;
				}
				
				m_clientImp client = new m_clientImp(account_no, rs.getString("firstname"), rs.getString("lastname"), rs.getString("displayname"), rs.getDate("date_of_birth"), gender);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sql.close();
		
	}
	
}

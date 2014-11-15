package cfg.team10.controller;
import java.sql.ResultSet;
import java.sql.SQLException;

import cfg.team10.model.*;
import cfg.team10.model.m_clientImp.Gender;
import cfg.team10.userinterface.*;

public class Controller {
	
	public m_clientImp client = null;

	public Controller(){

		//create interface
		//userInterface ui = new clientGUI();


	}

	public void getUserData(String id) {

		try {

			String query = 	"SELECT * FROM m_client WHERE id = " + id + ";";
			
			System.out.println("Query is: " + query);

			ResultSet rs = (new SQLinteraction()).runQuery(query);

			while(rs.next()) {

				System.out.println(rs.getString("account_no"));
				System.out.println(rs.getString("gender_cv_id"));
				System.out.println(rs.getString("mobile_no"));
				
				Gender gender = null;
				
				if( Integer.parseInt(rs.getString("gender_cv_id")) == 54){
					
					gender = Gender.Female;
				}else{
					gender = Gender.Male;
				}
				
				
				
				client = new m_clientImp();

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

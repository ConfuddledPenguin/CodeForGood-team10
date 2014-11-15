package cfg.team10.controller;
import java.sql.ResultSet;
import java.sql.SQLException;

import cfg.team10.model.m_clientImp;
import cfg.team10.model.m_clientImp.Gender;
import cfg.team10.userinterface.*;

public class Controller {

	m_clientImp client = null;

	public Controller(){

		//create interface
		//userInterface ui = new clientGUI();


	}

	public void getUserData(String id) {

		try {

			SQLinteraction sql = new SQLinteraction();

			String query = 	"SELECT * FROM m_client WHERE id = " + id + ";";

			ResultSet rs = sql.runQuery(query);
			
			System.out.println("RS = " + rs);

			while(rs.next()) {

				System.out.println(rs.getString("account_no"));

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

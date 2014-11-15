package cfg.team10.controller;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cfg.team10.algorithm.Algorithm;
import cfg.team10.model.*;
import cfg.team10.model.m_clientImp.Gender;
import cfg.team10.userinterface.*;

public class Controller {
	
	public m_clientImp client = null;

	public Controller(){

		//create interface
		//userInterface ui = new clientGUI();
		
		System.out.println("What is the id");
		Scanner s = new Scanner(System.in);
		
		getUserData(s.nextLine());


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
				
				
				client = new m_clientImp(rs.getString("account_no"), gender, rs.getString("mobile_no"));

			}
			

			//get loan data
			
			m_Status status = null;
			boolean outstanding = false;
			
			String query2 = "SELECT * FROM m_loan WHERE client_id = " + id + ";";
			
			System.out.println("Query is: " + query);
			
			ResultSet rs2 = (new SQLinteraction()).runQuery(query2);
			
			while(rs2.next()) {
				
				int stat = Integer.parseInt(rs2.getString("loan_status_id"));
				
				status = new m_Status(stat);
				
			}
			
			if(status != null){
				if (status.getStatus() == m_Status.ACTIVE){
					outstanding = true;
				}
			}
			
			
			System.out.println("How much whould you like?");
			Scanner s = new Scanner(System.in);
			Double requested = s.nextDouble();
			
			String query3 = "select duedate from m_loan_repayment_schedule where id = "+id + ";";
			String query4 = "select obligations_met_on_date from m_loan_repayment_schedule where id = "+id + ";";
			
			ResultSet rs3 = (new SQLinteraction()).runQuery(query3);
			
			java.sql.Date duedate = null;
			java.sql.Date metdate = new Date(0, 0, 0);
			
			while(rs3.next()){
				duedate = rs3.getDate("duedate");
			}
			
			ResultSet rs4 = (new SQLinteraction()).runQuery(query4);
			while(rs4.next()){
				metdate = rs4.getDate("obligations_met_on_date");
			}
			
			boolean paidOnTime = false;
			
			if (metdate.equals(duedate)){
				paidOnTime = true;
			}
		
			
			String query5 = "select account_balance_derived from m_savings_account where id=" + id+ ";";
			
			ResultSet rs5 = (new SQLinteraction()).runQuery(query5);
			
			double savingsBalance =0;
			
			while(rs5.next()){
				 savingsBalance = rs5.getDouble("account_balance_derived");
			}
			
			m_loanImp loan = new m_loanImp(status, requested, outstanding, paidOnTime, savingsBalance);
			
			//find rating
			Algorithm algo = new Algorithm(client, loan);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package cfg.team10.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import cfg.team10.model.*;

public class Algorithm {
	public Boolean reject = false;
	public Boolean paidOnTime = false;
	public double principle = 0.0;
	public int age = 0;
	public int loan_status = 0;

	public Algorithm(){



	}

	public double returnRating(int userID){
		Boolean reject = false;
		double pScore = 0;
		double fScore = 0;
		String gender = null;
		int age = 0;

		//end of variables to be created by database
		pScore = personalScore();
		if(!reject){
			fScore = financialScore(reject);
		}
		double rating = pScore+fScore;
		if(reject){
			rating = 0;
		}
		return rating;
	}


	private double personalScore(){
		String gender = "";//sql
		int age = 0;//sql
		Date DOB1 = new Date(0000,00,00);
		Date DOB2 = new Date(0000,00,00);
		Double principal = 15000.00;//sql
		Date dobString = new Date(2001,01,01);//sql

		double personalScore = 0.0;

		if(dobString.before(DOB1)){
			//something in here to do with the above DOB1/2 based on our findings from data analysis 
		}
		if(gender.toLowerCase().equals("male")) {
			personalScore = personalScore + 5;
		}
		if(principle<10000.00){
			personalScore = personalScore+15;
		} else if(principle<25000.00){
			personalScore = personalScore+9;
		}
		else{
			personalScore = personalScore+3;
		}	
		return personalScore;
	}

	private double financialScore(Boolean reject){
		//These will be initialised with getters accessing the database.
		int loan_status = 0;//sql
		Boolean paidOnTime = false;//sql
		Double outstandingLoan = 0.0;//sql
		Double principle = 0.0;//sql
		Double savingsBalance = 0.0;//sql

		//Loan status counts for 25% of their recommendation
		double status = 0.0;
		switch(loan_status){
		case 1: loan_status = 100;
		reject = true; //They've already applied for loan and not been approved or rejected yet, shouldn't be applying for another already

		case 2: loan_status = 200;
		reject = true; //They've just been approved for a loan and haven't even got the money yet/started repayments
		case 3: loan_status = 300;
		if (paidOnTime){
			status = status + 12.5;
		}
		else{
			reject = true;
		}
		case 4: loan_status = 400;
		status = status + 12.5;
		case 5: loan_status = 500;
		status = status + 5;
		case 6: loan_status = 600;
		status = status + 25;
		case 7: loan_status = 601;
		reject = true;
		case 8: loan_status = 602;
		status = status + 12.5;
		case 9: loan_status = 700;
		status = status + 25;
		}

		if(outstandingLoan == 0) {
			status = status + 10;
		}

		if(checkPaymentSchedule()) {
			status = status + 25;
		}

		if(savingsAccount()) {
			status = status + 5;
		}

		if(savingsBalance > principle) {
			status = status + 5;
		}

		return status;
	}

	public Boolean checkPaymentSchedule(){
		Boolean onTime = false;//sql check if they have been making payments on time

		return onTime;		
	}

	public Boolean savingsAccount(){
		Boolean hasSavings = false;//sql checks if they have a savings account

		return hasSavings;
	}

}

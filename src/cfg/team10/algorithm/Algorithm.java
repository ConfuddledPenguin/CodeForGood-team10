package cfg.team10.algorithm;

import cfg.team10.model.m_clientImp;
import cfg.team10.model.m_clientImp.Gender;


public class Algorithm {
	
	private Boolean reject = false;
	private Boolean paidOnTime = false;
	private double principle = 0.0;
	private int loan_status = 0;
	private m_clientImp client;


	public Algorithm(m_clientImp client){
		this.client = client;
		returnRating();
	}
	
	public double returnRating(){
		Boolean reject = false;
		double pScore = 0;
		double fScore = 0;
		Gender gender = client.getGender();
		int age = 0;
		
		//end of variables to be created by database
		pScore = personalScore();
		if(!reject){
			fScore = financialScore(reject);
		}
		double rating = pScore+fScore;
		if(reject){
			rating = 20;
		}
		System.out.println(rating);
		return rating;
	}
	
	
	private double personalScore(){
		Gender gender = client.getGender();
		
		double personalScore = 0.0;

		if(gender == Gender.Male) {
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
		int loan_status = 300;//sql
		Boolean paidOnTime = true;//sql
		Double outstandingLoan = 0.0;//sql
		Double principle = 12000.0;//sql
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
		
		if(client.getSavingsAccount()) {
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
	
	
	
	
	

	
	
}

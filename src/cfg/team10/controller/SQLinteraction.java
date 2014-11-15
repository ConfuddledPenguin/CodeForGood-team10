package cfg.team10.controller;

import java.sql.*;

public class SQLinteraction {
	
	private Connection con = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	
	public SQLinteraction(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://musoni.c4leprqodag9.eu-west-1.rds.amazonaws.com/musoni",
			        "student", "cfg2014!");		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ResultSet runQuery(String query){
		
		try {
			statement = con.createStatement();
			
			statement.executeQuery(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return resultSet;		
	}
	
	public void close() {
		close(resultSet);
		close(statement);
		close(con);
	}
	
	
	private void close(AutoCloseable c) {
		try {
			if (c != null) {
				c.close();
		    }
		} catch (Exception e) {
		    // don't throw now as it might leave following closables in undefined state
		}
	}

}

package cfg.team10.parsedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Populate {

	public Populate() {
		
		
		
	}
	
	public ArrayList<String> connect(Object table) {
		
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		
		String url = "jdbc:mysql://musoni.c4leprqodag9.eu-west-1.rds.amazonaws.com/musoni";
		String user = "student";
		String password = "cfg2014!";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM " + table.);
            
            while(rs.next()) {
            	
            	System.out.println(rs.getString(column));
            	
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public void generate() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		(new Populate()).connect("m_client");
		
	}

}


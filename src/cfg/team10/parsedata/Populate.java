package cfg.team10.parsedata;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

public class Populate {

	public static void main(String[] args) {

		Connection con = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://musoni.c4leprqodag9.eu-west-1.rds.amazonaws.com/musoni";
		String user = "student";
		String password = "cfg2014!";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			DatabaseMetaData dbmo = con.getMetaData();

			rs = dbmo.getTables(null, null, null, null);

			while(rs.next()) {

				String table_name = rs.getString(3);

				ResultSet colRes = dbmo.getColumns(null, null, table_name, null);

				System.out.println("Table Name " + table_name);

				while(colRes.next()) {

					String column_name = colRes.getString(4);
					int column_type = colRes.getInt(5);

					System.out.println("\tColumn Name: " + column_name + " Type: " + column_type);

					EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();

					attr.setName(column_name);
					attr.setEType(getDataType(column_type));
					
					classObject.getEStructuralFeatures().add(attr);

				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Complete");

	}

//	static private EDataType getDataType(int type) {
//
//		switch(type) {
//
//		case java.sql.Types.BIT:
//			return EcorePackage.Literals.EBOOLEAN;
//		case java.sql.Types.BOOLEAN:
//			return EcorePackage.Literals.EBOOLEAN;
//		case java.sql.Types.BIGINT:
//		case java.sql.Types.INTEGER:
//		case java.sql.Types.TINYINT:
//		case java.sql.Types.SMALLINT:
//			return EcorePackage.Literals.EINT;
//		case java.sql.Types.DECIMAL:
//			return EcorePackage.Literals.EDOUBLE;
//		case java.sql.Types.DATE:
//			return EcorePackage.Literals.EDATE;
//		case java.sql.Types.TIMESTAMP:
//			return EcorePackage.Literals.ELONG;
//		case java.sql.Types.VARCHAR:
//			return EcorePackage.Literals.ESTRING;
//		}
//
//		return null;
//
//	}

}


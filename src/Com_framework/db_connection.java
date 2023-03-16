package Com_framework;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db_connection 
{
	public void db() throws SQLException
	{
		java.sql.Connection con=DriverManager.getConnection("", "", "");
		Statement x=con.createStatement();
		ResultSet r=x.executeQuery("");
		
		
		
	}

}

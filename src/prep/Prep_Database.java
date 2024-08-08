package prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prep_Database 
{

	public static void main(String[] args) throws SQLException 
	{
		Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=abcd;database=s69");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from country");
		while (rs.next()) 
		{
			String ss=rs.getString(1);
			
		}

	}

}

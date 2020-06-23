package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class sql_database {

	public static Connection con=null;
	private static Statement st;
	@Test(priority=0)
	public void getconnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/emp";
		
		Connection con = DriverManager.getConnection(url, "root", "user123");
		st=con.createStatement();
	}
	@Test(priority=1)
	public void executequery() throws SQLException
	{
		String query="select * from emp_data";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			String name = rs.getString(1);
			int age = rs.getInt(2);
			
			System.out.println("Name:"+name+" "+"Age: "+age);
		}
	}
	@Test(priority=2)
	public void closeconnection() throws SQLException
	{
		if(con!=null)
			con.close();
	}

}



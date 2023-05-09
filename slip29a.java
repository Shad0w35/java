import java.sql.*;
import java.util.*;
import java.io.*;

class SlipA
{
	public static void main(String args[]) throws IOException
	{
	
		try
		{
			System.out.println("Hello");
			Class.forName("org.postgresql.Driver");
			System.out.println("Hello1");
			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/don","postgres","sanket1234");
			System.out.println("Hello2");
			Statement st =con.createStatement();
			System.out.println("Hello3");
			ResultSet rs= st.executeQuery("select * from donar");
			System.out.println("Hello4");
			ResultSetMetaData rsmd= rs.getMetaData();
			System.out.println("Hello5");
			int cnt= rsmd.getColumnCount();
			System.out.println("Column count "+ cnt);
			for(int i= 1; i<=cnt; i++)
			{	
					System.out.println("Column name="+rsmd.getColumnName(i));
					System.out.println("Column type=" +rsmd.getColumnTypeName(i));
			}
			//rs.close();
			//rsmd.close();
			//st.close();
			con.close();
		}
		catch(Exception e){}
		
	}
}		
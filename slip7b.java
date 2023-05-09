import java.sql.*;

class Slip_B
{
	public static void main(String args[]) throws Exception
	{	
		try
		{
			Class.forName("org.postgresql.Driver");
 			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres"," ");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from product");
			while(rs.next())
			{
				for(int i=1;i<=3;i++)
				{
					String cval= rs.getString(i);
					System.out.print(cval + " " );
				}
				System.out.println(" ");
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

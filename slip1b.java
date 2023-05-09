import java.sql.*;
class Slip1_B
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp","postgres","1234");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("insert into empl values('one','xyz','ceo','two')");
		rs.close();
		st.close();
		con.close();
	}
}
package jdbcdemo;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class InsertDemo {
		public static void main(String[] args)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				System.out.println("connection established..");
				Statement smt=con.createStatement();
				String sql="delete from emp11 where ename='uma'";
				//ResultSet rs=smt.executeQuery("select * from emp11");
			smt.executeUpdate(sql);
//				while(rs.next())
//				{
//					System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getInt(3));
//				}
//				con.close();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}

	}




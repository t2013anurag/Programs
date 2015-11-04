import java.sql.*;
public class jdbctestold
{
public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
       
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con = DriverManager.getConnection("jdbc:odbc:Student", "",""); 
    Statement s = con.createStatement();

    s.execute("select * from stu"); 

    ResultSet rs = s.getResultSet(); 
    
    System.out.println("Regno name   Total");
    while ( rs.next() ) 
      {
      	System.out.print(rs.getString(1) + "   " +rs.getString(2) +"   " );
	System.out.println("     "+ (rs.getInt(3)+rs.getInt(4)+rs.getInt(5)));
	 }
	rs.close();
        s.close(); 
        con.close(); 
    }
  }

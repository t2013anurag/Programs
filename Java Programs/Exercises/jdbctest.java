import java.sql.*;
import java.util.Scanner;

public class jdbctest
{ Connection conn=null;

  public static void main(String[] args)
  {
   Scanner sre = new Scanner(System.in);
   	try { 
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
	
	Connection conn=DriverManager.getConnection("jdbc:odbc:Student","","");
	
		while (true)
		{
		System.out.println("1.Select");
 		System.out.println("2.Insert");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.Exit");
		System.out.println("Enter ur choice");
		int choice = sre.nextInt(6);
		switch (choice)
		{
		case 1: 		
		    System.out.println("[OUTPUT FROM SELECT]");
 		    Statement st = conn.createStatement();
 	            st.execute("select * from stu");
	            ResultSet rs = st.getResultSet(); 
		    System.out.println("REgno    Name    Total");
               while (rs.next())
               {
	 	String s = rs.getString(1);
	        String s1 = rs.getString(2);
		int m1 = rs.getInt(3);
		int m2 = rs.getInt(4);	
		int m3 = rs.getInt(5);
	        System.out.println(s + "   " + s1 + "   "  + (m1+m2+m3));
      		}
  
		break;
case 2: 

    	System.out.println("\n[Performing INSERT] ... ");
	st = conn.createStatement();
        st.executeUpdate("INSERT INTO stu VALUES (999, 'AAA', 55,66,77)");
	break;
 case 3: 
    System.out.println("\n[Performing UPDATE] ... ");
    st = conn.createStatement();
    st.executeUpdate("UPDATE stu SET regno='111' WHERE name='AAA'");
    break;

case 4: 
    System.out.println("\n[Performing DELETE] ... ");
       st = conn.createStatement();
      st.executeUpdate("DELETE FROM stu WHERE name='AAA'");
    break;
case 5: System.exit(0);
}
}
}
        catch (Exception err) {
        System.out.println("ERROR: " + err);
 	}
	
}
}
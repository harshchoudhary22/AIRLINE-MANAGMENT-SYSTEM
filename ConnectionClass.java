
package AMS;

import java.sql.*;

public class ConnectionClass 
{
   Connection con;
   Statement stm;
    
   ConnectionClass()
   {
      try
      {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:330/ams","root","123456789");
         stm=con.createStatement();
      } 
      catch(Exception ex)
      {
         ex.printStackTrace();
      }
   }
   public static void main(String[] args)
   {
       new ConnectionClass();
   }
}

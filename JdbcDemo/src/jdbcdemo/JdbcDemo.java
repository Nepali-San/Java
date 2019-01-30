package jdbcdemo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JdbcDemo {

    public static void main(String[] args)  {
        try{
            
            //get a connection to db
            Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost/family","root","" );
            //create a statement
            java.sql.Statement mystat = myconn.createStatement();
            //execute sql query
            ResultSet myrs = mystat.executeQuery("select * from members");  //for select query
            
            /*
            use executeUpdate to create, drop , insert, update , delete
            
            int result=mystat.executeUpdate("delete from members where first_name = Tek");  
            System.out.println(result+" records affected");  
            */
            
            //process the query            
            while(myrs.next()){   //here myrs points above first row initially         
                System.out.println(myrs.getString("first_name") + "  " + myrs.getString("last_name")+ "  " + myrs.getString("contact"));
            }
            myconn.close();
        }
        catch(SQLException ex){
          //  System.out.println(ex);
            JOptionPane.showMessageDialog(null,ex);
        }       
    }    
}
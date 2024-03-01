/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.sql.*;
public class DbConn {
    
public static Connection connect(){
         Connection myConn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/traffic_fine_management_system", "root", "");         
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return myConn;
    }
}


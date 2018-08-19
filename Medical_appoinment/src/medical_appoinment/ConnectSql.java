/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical_appoinment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Olku
 */

public class ConnectSql {
    public Connection getconnection(){
        Connection conn = null;
        try{
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Demojava;integratedSecurity=true");
            Statement stmt = conn.createStatement(); 
            ResultSet rs; 

        }
        catch(Exception e){
            System.out.println("error" + e.toString());
    
        }
    return conn;
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import java .sql.*;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 *
 * @author himan
 */
public class javaconnect {
    Connection conn = null;
   
    public static Connection ConnecrDb(){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Hsb8@1996");
            return conn;
            
        } catch (Exception e) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, e);
        
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conferance.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zaefdfyjhlk
 */
public class ConnecterBD {
     Connection con = null;
    String urlPilote="oracle.jdbc.driver.OracleDriver";
    String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
    public ConnecterBD() 
    {
       try
       {
           Class.forName(urlPilote);
           System.out.println("pilote chargé");
       }
       catch (ClassNotFoundException e) 
       {
           e.printStackTrace();
       }
       try
       {
           con = DriverManager.getConnection(urlBD);
           System.out.println("Connexion établie");   
       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
    }
    public Connection ObtenirCnx()
    {
       return con;
    }
    
}

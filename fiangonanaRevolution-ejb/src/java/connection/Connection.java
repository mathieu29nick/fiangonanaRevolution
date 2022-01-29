/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.DriverManager;

/**
 *
 * @author P13A-97-SOATOAVINA
 */
public class Connection {
     public static java.sql.Connection getConnection()throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://P13-97-1168\\SQLEXPRESS;databaseName=fiangonanaRevolution;integratedSecurity=false;Trusted Connection=true","sa","1234");
        System.out.println(con+" haha");
        return con;
    }
}

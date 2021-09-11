package com.moneytap.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

	public static Connection connectDB(String database) throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/"+database;
        String uName="postgres";
        String password="postgres";
        Connection con= DriverManager.getConnection(url,uName,password);
        if (con!=null){
            System.out.println("Connection to "+database+" established");
        }
        else {
            System.out.println("Problem Connecting to "+database+" ............");
        }

        return con;
}
}

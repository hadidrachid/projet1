package fr.dawan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties; 

public class ConnexionBDD {

    public static Connection getConnection() throws Exception {

        Properties p = new Properties();
        p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));

        Class.forName(p.getProperty("driver"));
        Connection cnx = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"), p.getProperty("pwd"));
        return cnx;
    }

}


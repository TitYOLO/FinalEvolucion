package Conex;

import java.sql.*;

public class Conexion {
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=DBPH;"
                + "user=PRBD;"
                + "password=ROOT;";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}

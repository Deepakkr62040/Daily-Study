package Java.basic;

public class Basics {
    public static void main(String args[]){
        System.out.println("Hello, Deepak");
    }
}


//advance java database connectivity................
package myfirstapplication;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyFirstApplication {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/advanceJava";
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
            
            System.out.println("Database connection successfullly.");
        } catch(ClassNotFoundException e){
            System.out.println("Error: JDBC driver not found.");
        } catch(SQLException e){
            System.out.println("Error: Database connection failed.");
            System.out.println("Reason: " + e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            } catch(SQLException e){
                System.out.println("Error: while closing connection");
            }
        }
    }
}

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //importing the JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");

        String databaseUrl ="jdbc:mysql://localhost/mydatabase";//mydatabase is the name of the database created

        //connection database
        Connection conn =DriverManager.getConnection(databaseUrl,"root","admin");
        System.out.println("database created");


        Statement stm = conn.createStatement();
        ResultSet rs =stm.executeQuery("Select * from student");//student is the table name

        while (rs.next())
        {
            System.out.println(rs.getString("name"));//here name and id are the column name
            System.out.println(rs.getString("id"));
        }



    }
}
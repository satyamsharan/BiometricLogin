/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.dei.pcs.csw;

import java.sql.*;

/**
 *
 * @author Satyam Sharan
 */
public class Database {

    Connection con;
    Statement statement;
    ResultSet resultSet;

    public void startDatabase() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/biometric";
            con = DriverManager.getConnection(url, "root", "Password@99");
            statement = con.createStatement();


        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ResultSet executeQuarry(String quarry) throws SQLException {
        resultSet = statement.executeQuery(quarry);
        return (resultSet);
    }

    public boolean updateQuarry(String quarry) throws SQLException {
        return (statement.execute(quarry));

    }

    public void closeDatabase() throws SQLException {
        con.close();
    }
}

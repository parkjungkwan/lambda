package com.bitcamp.api.user;

import java.sql.*;

public class UserRepository {

    public void addUsers() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bitcampdb";
        String userName = "root";
        String password = "rootroot";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users");

        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);

        resultSet.close();
        statement.close();
        connection.close();
    }
}

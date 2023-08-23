package sqlClass01;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";
        try {
            Connection connection = DriverManager.getConnection(dbUrl, userName, password);
            Statement statement = connection.createStatement();
            String query = "select * from person";
            ResultSet resultset = statement.executeQuery(query);
            while (resultset.next()) {
                String firstName = resultset.getString("Firstname");
                int age = resultset.getInt("age");
                String city=resultset.getString("City");
                System.out.println(firstName+" "+age+" "+city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

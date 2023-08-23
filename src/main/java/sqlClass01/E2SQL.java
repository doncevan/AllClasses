package sqlClass01;

import utils.ConfigReader;

import java.sql.*;

public class E2SQL {
    public static void main(String[] args) {
        String dbUrl = ConfigReader.getProperty("dbUrl");
        String dbUserName = ConfigReader.getProperty("dbUserName");
        String dbPassword = ConfigReader.getProperty("dbPassword");
        try {
            Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
            Statement statement=connection.createStatement();
            String query="select * from employee";
            ResultSet resultSet= statement.executeQuery(query);
            ResultSetMetaData metaData= resultSet.getMetaData();
            int columnCount=metaData.getColumnCount();
            for (int i = 1; i <=columnCount ; i++) {
                System.out.print(metaData.getColumnLabel(i)+" ");
            }
            System.out.println();
            while (resultSet.next()){
                for (int i = 1; i <=columnCount ; i++) {
                    System.out.print(resultSet.getString(i)+" ");
                }
                System.out.println();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
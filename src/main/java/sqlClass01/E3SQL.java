package sqlClass01;

import utils.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E3SQL {
    public static void main(String[] args) {
        String dbUrl = ConfigReader.getProperty("dbUrl");
        String dbUserName = ConfigReader.getProperty("dbUserName");
        String dbPassword = ConfigReader.getProperty("dbPassword");
        List<Map<String, String>> empMapList = new ArrayList<>();
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
                Statement statement = connection.createStatement();
                String query = "select * from employee";
                ResultSet resultSet = statement.executeQuery(query);
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                while (resultSet.next()) {
                    Map<String, String> rowMap = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        String key = metaData.getColumnLabel(i);
                        String value = resultSet.getString(i);
                        rowMap.put(key, value);
                    }
                    empMapList.add(rowMap);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(empMapList);
        }
    }

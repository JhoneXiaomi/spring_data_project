package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author jhone
 * @Description: JDBC 工具类：
 *                          1 获取Connection
 *                          2 释放资源
 * @Date 14:57 2017/11/20
 * Modified by:
 */
public class JDBCUnit {

    public static Connection getConnection() throws Exception{

        String driverClass = "com.mysql.jdbc.Driver";
        String url = "jdbc://mysql:///spring_data";
        String userName = "root";
        String passWord = "root";
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url,userName,passWord);

        return  connection;
    }
}

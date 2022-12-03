package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverManage {
    // JDBC API 详解：DriverManage
    public static void main(String[] args) throws SQLException {
        // 如果连接的是本机数据库，且端口为3306，则可以简写
        // useSSL=false 禁用安全连接方式，解决警告提示
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "Karlex1238";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "update t_organization set o_entered = 85 where id = '671cf';";
        Statement stmt = connection.createStatement();

        int result = stmt.executeUpdate(sql);  // 受影响的行数

        System.out.println(result);


        stmt.close();
        connection.close();
    }
}

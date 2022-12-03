import org.junit.Test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_ResultSet {
    // JDBC API 详解：ResultSet

    @Test
    // 执行DQL语句
    public void testResultSet() throws SQLException {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";

        Statement statement = DriverManager.getConnection(url, username, password).createStatement();

        String sql = "select * from t_organization;";

        ResultSet resultSet = statement.executeQuery(sql);

        // getXXX() 参数：int 列的编号，从1开始 ; String 列的名称
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String o_name = resultSet.getString(2);
            String o_code = resultSet.getString(3);
            String o_category = resultSet.getString(4);
            String o_entered = resultSet.getString(5);
            String o_username = resultSet.getString(6);
            String o_phone = resultSet.getString(7);
            String o_deleted = resultSet.getString(8);

            System.out.print(id + " ");
            System.out.print(o_name + " ");
            System.out.print(o_code + " ");
            System.out.print(o_category + " ");
            System.out.print(o_entered + " ");
            System.out.print(o_username + " ");
            System.out.print(o_phone + " ");
            System.out.print(o_deleted + " ");
            System.out.println();
            System.out.println("========================================");
        }


        resultSet.close();
        statement.close();

    }
}

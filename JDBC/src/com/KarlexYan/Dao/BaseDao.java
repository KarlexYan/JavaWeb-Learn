package com.KarlexYan.Dao;

import com.KarlexYan.DBUtils.JDBCUtils;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDao {
    // 优化查询 sql语句 结果集 参数
    public static Object query(String sql, ResultSetHandler<?> rsh, Object... params) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 获取连接
            conn = JDBCUtils.getConnection();
            // 预编译sql
            preparedStatement = conn.prepareStatement(sql);
            // 将参数设置进去
            for (int i = 0; i < params.length && params != null; i++) {
                preparedStatement.setObject(i + 1, params);
            }
            // 发送sql
            resultSet = preparedStatement.executeQuery();
            // 让调用者实现对结果集的处理
            Object obj = rsh.handle(resultSet);
            return obj;
            // 关闭资源
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.release(resultSet, preparedStatement, conn);
        }
        return null;
    }
}

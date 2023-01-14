package com.KarlexYan.DBUtils;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBConnectionTest {

    @Test
    public void searchTitle() throws SQLException {
        ResultSet resultSet = DBConnection.searchTitle("select title from info");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("title"));
        }
    }
}
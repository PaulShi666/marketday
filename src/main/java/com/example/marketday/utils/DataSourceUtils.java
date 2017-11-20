package com.example.marketday.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceUtils {
    private static DataSource dataSource = new ComboPooledDataSource();
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    public static DataSource getDataSource() {
        return dataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static Connection getCurrentConnection() throws SQLException {

        Connection con = tl.get();
        if(con == null){
            con = dataSource.getConnection();

            tl.set(con);
        }
        return con;
    }
}

package com.fanfengping.service;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

public class DbMysqlServiceTest {
    private String dbUrl  = "jdbc:mysql://127.0.0.1:3306/atm_monitor?useUnicode=true&characterEncoding=UTF8";
    private String dbUser = "user_monitor";
    private String dbPass = "fanfengping123";

    @Test
    public void test() throws SQLException {
        Connection dbConn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        DatabaseMetaData dbmd = dbConn.getMetaData();
        System.out.println(dbmd.getDatabaseProductName());
        System.out.println(dbmd.getDatabaseProductVersion());
        System.out.println(dbmd.getURL());
        System.out.println(dbmd.getUserName());
        System.out.println(dbmd.getDriverName());

        ResultSet resultSet = dbmd.getTables(null, null, null, new String[]{"TABLE"});
        
        while (resultSet.next()) {
            if (resultSet.getString(4) != null
                    && (resultSet.getString(4).equalsIgnoreCase("TABLE"))) {
                String tableName = resultSet.getString(3).toLowerCase();
                System.out.println(tableName);
                ResultSet dbsColRet = dbmd.getColumns(null, "%", tableName, "%");
                
                while (dbsColRet.next()) {
                    String columnName = dbsColRet.getString("COLUMN_NAME");
                    String columnType = dbsColRet.getString("TYPE_NAME");
                    int datasize = dbsColRet.getInt("COLUMN_SIZE");
                    int digits = dbsColRet.getInt("DECIMAL_DIGITS");
                    int nullable = dbsColRet.getInt("NULLABLE");
                    System.out.println(String.format("%s-%s-%s-%s-%s", columnName, columnType, datasize, digits, nullable));
                }
                
                ResultSetMetaData md = dbsColRet.getMetaData();
                
                for (int i = 1; i < md.getColumnCount(); i++) {
                    System.out.println(md.getColumnTypeName(i));
                    System.out.println(md.getColumnType(i));
                    System.out.println(md.getColumnName(i));
                    System.out.println(md.isNullable(i));
                    System.out.println(md.getPrecision(i));
                    System.out.println(md.getScale(i));
                    System.out.println(md.isAutoIncrement(i));
                    System.out.println(md.getSchemaName(i));
                    System.out.println(md.getColumnDisplaySize(i));
                    System.out.println(md.isDefinitelyWritable(i));
                }
                
            }
        }
    }
}

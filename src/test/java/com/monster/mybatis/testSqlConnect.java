package com.monster.mybatis;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author wuhan
 * @Date 2019/12/6 15:26
 */
public class testSqlConnect {

    @Test
    public void testSqlConnect() {
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=GMT%2B8";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String passWord = "root";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url, userName, passWord);
            if (con != null) {
                System.out.println("连接成功");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

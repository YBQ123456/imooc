package com.imooc.db;

import java.sql.*;

public class DBUtil {
    private static final String url="jdbc:mysql://localhost:3306/seckill";
    private static final String user="root";
    private static final String password="root";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库链接
        Connection connection = DriverManager.getConnection(url, user, password);
        //通过数据库的链接操作数据库
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select user_phone,seckill_id from success_killed ");
        while (resultSet.next()){
            System.out.println("i");
            System.out.println(resultSet.getLong("user_phone")+","+resultSet.getLong("seckill_id"));
        }
    }
}

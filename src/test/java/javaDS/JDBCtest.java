package javaDS;


import java.sql.*;

/**
 * @author: Ray
 * @date: 2023年09月07日 16:35
 */
public class JDBCtest {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    static final String USER = "root";
    static final String PASS = "";
    static final String sql = "SELECT id, name, age FROM user limit 1";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //1.注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            //2.打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //3.执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("id = " + rs.getInt("id"));
                System.out.println("name = " + rs.getString("name"));
                System.out.println("age = " + rs.getInt("age"));
            }
            //4.关闭资源
            rs.close();
            conn.close();
            stmt.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

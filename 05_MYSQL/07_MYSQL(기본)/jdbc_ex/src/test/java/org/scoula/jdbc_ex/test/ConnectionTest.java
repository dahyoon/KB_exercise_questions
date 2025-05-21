package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionTest {
    @Test
    @DisplayName("DB연결 테스트 결과")
    public void testConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        // 1. 드라이버 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공..");
        // 2. 데이터베이스 연결
        String url = "jdbc:mysql://localhost:3306/jdbc_ex";
        String user = "scoula";
        String password = "1234";
        con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db 연결 성공.");
    }

    @Test
    @DisplayName("DB 연결 테스트 결과 2")
    public void testConnection2() throws ClassNotFoundException, SQLException {
        try(Connection conn = JDBCUtil.getConnection()) {
            System.out.println("DB 연결 성공!");
        }
    }
}
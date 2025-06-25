package org.scoula.jdbc_ex.test;
import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import java.sql.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // 테스트하고 싶은 기능에 순서(order)를 주기 위한 annotation
public class CrudTest {
    Connection conn = JDBCUtil.getConnection();

    @AfterAll // 모든 테스트 실행 후 실행됨
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("새로운 user 등록")
    @Order(1)
    public void insertUser() throws SQLException {
        String sql = "insert into users(id, password, name, role) values(?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "scoula6");
            pstmt.setString(2, "scoula3");
            pstmt.setString(3, "스콜라");
            pstmt.setString(4, "USER");
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
        // pstmt.close();
        // catch문은 생략 가능 (예외는 throws로 위임했으므로)
        // PreparedStatement는 try-with-resources로 자동 close됨
    }

    @Test
    @DisplayName("user 목록 추출")
    @Order(2)
    public void selectUser() throws SQLException {
        String sql ="select * from users";
        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }
        // rs.close();
        // stmt.close();
        // stmt와 rs는 try-with-resources로 자동 close됨
        // catch문 생략 가능 (예외는 throws로 위임했으므로)
    }

    @Test
    @DisplayName("특정 user 검색")
    @Order(3)
    public void selectUserById() throws SQLException {
        String userid = "scoula";
        String sql ="select * from users where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userid);
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    System.out.println(rs.getString("name"));
                } else {
                    throw new SQLException("scoula not found");
                }
            }
            // rs.close();
            // ResultSet은 try-with-resources로 자동 close됨
            // catch문 생략 가능 (try문 안에서 throw SQLException했으므로)
        }
        // pstmt.close();
        // PreparedStatement도 try-with-resources로 자동 close됨
        // catch문 생략 가능 (예외는 throws로 위임했으므로)
    }

    @Test
    @DisplayName("특정 user 수정")
    @Order(4)
    public void updateUser() throws SQLException {
        String userid = "scoula";
        String sql ="update users set name= ?  where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "스콜라 수정");
            pstmt.setString(2, userid);
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
        // pstmt.close();
        // PreparedStatement는 try-with-resources로 자동 close됨
        // catch문 생략 가능 (예외는 throws로 위임했으므로)
    }

    @Test
    @DisplayName("지정한 사용자 삭제")
    @Order(5)
    public void deleteUser() throws SQLException {
        String userid = "scoula";
        String sql ="delete from users where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userid);
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
        // pstmt.close();
        // PreparedStatement는 try-with-resources로 자동 close됨
        // catch문 생략 가능 (예외는 throws로 위임했으므로)
    }
}
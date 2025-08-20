package org.scoula.persistence;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import static org.junit.jupiter.api.Assertions.fail; // 테스트에서 명시적으로 실패를 발생시킬 때 사용
                                                        // 예: 예외가 발생하지 않으면 실패로 처리하고 싶을 때

@Log4j2 // log 객체 자동 생성
public class JDBCTests {
    @BeforeAll // BeforeAll이 붙으면 반드시 static이어야 함
    @DisplayName("JDBC 드라이버 로딩")
    public static void setup() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            log.info("Driver loaded");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("JDBC 드라이버 연결")
    public void testConnection() {
        String url = "jdbc:mysql://localhost:3306/scoula_db";
        String user = "scoula";
        String password = "1234";
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            log.info("Created connection: " + con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

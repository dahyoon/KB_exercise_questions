package org.scoula.security.util;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.scoula.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class, SecurityConfig.class})
@Log4j2
class JwtProcessorTest {
    @Autowired
    JwtProcessor jwtProcessor;

    @Test
    void generateToken() {
        String username = "user1";
        String token = jwtProcessor.generateToken(username);
        log.info(token);
        assertNotNull(token);
    }

    @Test
    void getUsername() {
        String token = "eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMSIsImlhdCI6MTc1MDc0MDU2NSwiZXhwIjoxNzUwNzQwODY1fQ.NQLC8ykMBaZxphDQ3RhH8oGQbu4CVhrbSo1m6iSVa7xLRTVZL1-U-bfyahyF7TnF";
        String username = jwtProcessor.getUsername(token);
        log.info(username);
        assertNotNull(username);
    }

    @Test
    void validateToken() {
        // 5분 경과 후 테스트
        String token = "eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMSIsImlhdCI6MTc1MDc0MDU2NSwiZXhwIjoxNzUwNzQwODY1fQ.NQLC8ykMBaZxphDQ3RhH8oGQbu4CVhrbSo1m6iSVa7xLRTVZL1-U-bfyahyF7TnF";
        boolean isValid = jwtProcessor.validateToken(token); // 5분 경과 후며 예외 발
        log.info(isValid);
        assertTrue(isValid); // 5분 전이면 true
    }
}
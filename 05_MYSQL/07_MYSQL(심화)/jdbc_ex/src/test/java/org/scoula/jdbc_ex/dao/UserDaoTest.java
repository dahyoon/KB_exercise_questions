package org.scoula.jdbc_ex.dao;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional; // 이거 있어야 테스트 코드에서 orElseThrow 사용 가능
import java.util.NoSuchElementException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserDaoTest {
    UserDao dao = new UserDaoImpl();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("user 등록 테스트")
    @Order(1)
    void create() throws SQLException {
        UserVO user = new UserVO("testUser1", "1234", "안다윤_시험1", "ADMIN");
        int count = dao.create(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @DisplayName("UserDao User 목록 추출 테스트")
    @Order(2)
    void getList() throws SQLException{
        List<UserVO> list = dao.getList();
        for (UserVO vo: list) {
            System.out.println(vo);
        }
    }

    @Test
    @DisplayName("특정 user 1건 추출 테스트")
    @Order(3)
    void get() throws SQLException {
        // UserVO user = dao.get("user1").orElseThrow(NoSuchElementException::new);
        UserVO user = dao.get("user1");
        if (user == null) {
            throw new NoSuchElementException();
        }
        Assertions.assertNotNull(user);
    }

    @Test
    @DisplayName("user 정보 수정 테스트")
    @Order(4)
    void update() throws SQLException {
        // UserVO user = dao.get("user1").orElseThrow(NoSuchElementException::new);
        UserVO user = dao.get("user1");
        if (user == null) {
            throw new NoSuchElementException();
        }
        user.setName("새로운이름_테스트");
        int count = dao.update(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @DisplayName("user 삭제 테스트")
    @Order(5)
    void delete() throws SQLException {
        int count = dao.delete("user1");
        Assertions.assertEquals(1, count);
    }
}
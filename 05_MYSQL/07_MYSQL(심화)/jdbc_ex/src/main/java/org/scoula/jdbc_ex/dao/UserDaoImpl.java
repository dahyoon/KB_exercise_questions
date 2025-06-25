package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    // DB 연결 및 사용하는 1, 2, 3, 4 단계 코드

    //1, 2단계: 드라이버 설정 및 DB 연결
    Connection conn = JDBCUtil.getConnection();
    //후 각 메소드별로 3, 4 단계 (SQL문 객체 생성 및 DB로 보내 실행 + 결과 처리)만 작성

    // USERS 테이블 관련 SQL 명령어
    private String USER_LIST = "select * from users";
    private String USER_GET = "select * from users where id = ?";
    private String USER_INSERT = "insert into users values(?, ?, ?, ?)";
    private String USER_UPDATE = "update users set name = ?, role = ? where id = ?";
    private String USER_DELETE = "delete from users where id = ?";

    // 회원 등록
    @Override
    public int create(UserVO user) throws SQLException {
        //3단계 - sql문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_INSERT);
        pstmt.setString(1, user.getId()); //id 넣기
        pstmt.setString(2, user.getPassword()); //pw 넣기
        pstmt.setString(3, user.getName()); //name 넣기
        pstmt.setString(4, user.getRole()); //role 넣기

        //4단계 - sql문 db서버로 전송하고 뒷처리
        int count = pstmt.executeUpdate(); //insert문 결과는 실행된 row수
        System.out.println("실행될 row수 " + count);
        pstmt.close();
        return count;
    }

    // 회원 목록 조회
    @Override
    public List<UserVO> getList() throws SQLException {
        //3단계 - SQL문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_LIST);

        //4단계 - sql문 db서버로 전송하고 뒷처리
        ResultSet rs = pstmt.executeQuery(); //select!
        // 결과 행이 많은 경우 각 VO(행)를 ArrayList에 담기
        List<UserVO> list = new ArrayList<UserVO>();

        while(rs.next()){ //반복할 때마다 다음 행을 가리키면서(cursor,커서) 있는지 체크
            //있으면, 각 컬럼값을 꺼내와서 VO에 넣기
            UserVO user = new UserVO();
            user.setId(rs.getString("id")); //id는 컬럼명, 컬럼면 대신 인덱스 (컬럼 순, 1부터 시작) 사용 가능하지만 컬럼명 사용 권장
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
            list.add(user); // VO를 ArrayList에 넣기
        }
        rs.close();
        pstmt.close();
        return list;
    }

    // 회원 정보 조회
    @Override
    public UserVO get(String id) throws SQLException {
        //3단계 - SQL문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_GET);
        pstmt.setString(1, id); // 첫번째 ?에 id 넣기

        //4단계 - sql문 db서버로 전송하고 뒷처리
        ResultSet rs = pstmt.executeQuery();
        UserVO user = new UserVO();
        if(rs.next()){
            //있으면, 각 컬럼값을 꺼내와서 VO에 넣기
            user.setId(rs.getString("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
        }
        rs.close();
        pstmt.close();
        return user;
    }

    // 회원 수정
    @Override
    public int update(UserVO user) throws SQLException {
        //3단계 - SQL문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_UPDATE);
        pstmt.setString(1, user.getName());
        pstmt.setString(2, user.getRole());
        pstmt.setString(3, user.getId());
        int count = pstmt.executeUpdate();
        pstmt.close();
        return count;
    }

    // 회원 삭제
    @Override
    public int delete(String id) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(USER_DELETE);
        pstmt.setString(1, id);
        int rows = pstmt.executeUpdate();
        pstmt.close();
        return rows;
    }
}
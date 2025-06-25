package org.scoula.jdbc_ex.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    // 자바에서 가방에 들어있는 데이터를 나중에 넣거나 꺼냈을 때 사용할 가방 역할의 클래스
    // VO는 RDB의 테이블(엔터티)마다 하나씩 생성
    // VO의 변수는 테이블의 컬럼과 동일한 이름으로 생성
    private String id;
    private String password;
    private String name;
    private String role;

    // 가방의 각 필드에 값을 넣을 때는 setMethod() 사용
    // 가방의 각 필드의 값을 꺼낼 때는 getMethod() 사용
}

package org.scoula.security.account.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Data
public class CustomUser extends User { // User는 security에서 제공하는 클래스
    // Security 내에서 회원정보를 담을 객체: User 객체
    // 우리의 회원정보는 MemberVO에 있음
    // MemberVO -> User 객체레 매핑 시켜줘야 함
    private MemberVO member;

    // 생성자 2개 만들기
    public CustomUser(String username, String password,
                      Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
    public CustomUser(MemberVO vo) {
        super(vo.getUsername(), vo.getPassword(), vo.getAuthList());
        this.member = vo;
    }
}

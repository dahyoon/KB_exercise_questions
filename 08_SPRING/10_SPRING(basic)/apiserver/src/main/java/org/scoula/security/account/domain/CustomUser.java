package org.scoula.security.account.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Data
public class CustomUser extends User { // User는 security에서 제공하는 클래스
    private MemberVO member;

    public CustomUser(String username, String password,
                      Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
    public CustomUser(MemberVO vo) {
        super(vo.getUsername(), vo.getPassword(), vo.getAuthList());
    }
}

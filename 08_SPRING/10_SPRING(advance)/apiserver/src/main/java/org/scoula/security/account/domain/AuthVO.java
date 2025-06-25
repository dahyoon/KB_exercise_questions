package org.scoula.security.account.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class AuthVO implements GrantedAuthority {
    private String username; // 사용자 id
    private String auth; // role, ROLE_ --> 여기까지 같아야함. 뒤에는 설정 가능
    // ROLE_ADMIN, ROLE_MEMBER (대문자 사용)

    @Override
    public String getAuthority() {
        return auth;
    }


}

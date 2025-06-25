package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.security.account.domain.CustomUser;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal; // getName()으로 username 얻기

@Log4j2
// @RequestMapping("/security")
@RequestMapping("api/security")
// @Controller
@RestController
public class SecurityController {
    @GetMapping("/login")
    public void login() {
        log.info("login page");
    }
    @GetMapping("/logout")
    public void logout() {
        log.info("logout page");
    }
    @GetMapping("/all") // 모두 접근 가능
    public void doAll() {
        log.info("do all can access everybody");
    }
    @GetMapping("/member") // MEMBER 또는 ADMIN 권한 필요
    public void doMember(Principal principal) {
        log.info("logged in member");
        log.info("principal값: " + principal);
        log.info("principal 객체의 이름값: " + principal.getName()); // getName()으로 username 얻기
    }
    @GetMapping("/admin") // ADMIN 권한 필요
    public void doAdmin(@AuthenticationPrincipal CustomUser customUser) {
        log.info("admin only");
        MemberVO member = customUser.getMember();
        log.info("member값: " + member);
    }
}

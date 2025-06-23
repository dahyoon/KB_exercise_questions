package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@RequestMapping("/security")
@Controller
public class SecurityController extends WebSecurityConfigurerAdapter {
    @GetMapping("/login")
    public void login() {
        log.info("login 화면");
    }
    @GetMapping("/logout")
    public void logout() {
        log.info("logout 화면");
    }
    @GetMapping("/all")
    public void doAll() { // 모두 접근 가능
        log.info("모두 접근 가능");
    }

    @GetMapping("/member") // member 또는 admin 권한 필요
    public void doMember() {
        log.info("member 또는 admin으로 로그인함");
    }

    @GetMapping("/admin") // admin 권한 필요
    public void doAdmin() {
        log.info("admin만 로그인함");
    }
}


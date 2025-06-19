package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Singleton, Spring에 Controller 역할하는 클래스로 설정
@Log4j2
public class HomeController {
    @GetMapping("/")
    public String home() {
        log.info("=======> HomeController /");
        return "index"; // View 이름
    }
}
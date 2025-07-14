package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 자동으로 Singleton으로 생성
@Log4j2
public class HomeController {

    // 요청 하나당 함수 하나!
    // 요청이 어떻게 들어오는지 설정
    // 어떤 함수를 부를지 정의함

    @GetMapping("/") // "/"주소로 get요청이 들어오면
    public String home(){
        // Spring이 HandlerMapper에 주소와 방식에 따른 어떤 Controller의 메서드를
        // 불러야할지 자동으로 등록시켜줌
        System.out.println("HomeController ===== ");
        log.info("================> HomController /");
        return "index"; //view파일 이름 Front Controller에서 리턴함

        // View Resolver가 /WEB-INF/views/index.jsp를 붙여서
        // Front Controller가 불러야할 파일명으로 만들어줌.(렌더링)
    }
}

package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller // Controller 클래스: HTTP 요청을 받아 처리하고, 뷰를 반환 // @RestController와 달리 뷰 이름을 반환하여 HTML, JSP 등의 화면 렌더링에 사용됨
@RequestMapping("/board") // /board로 시작하는 모든 요청 URL 경로 처리
@RequiredArgsConstructor // final 필드나 @NonNull 필드에 대해 자동으로 생성자 생성
public class BoardController {
    final private BoardService service;

    // 전체 목록 조회
    @GetMapping("/list")
    public void list(Model model) {
        log.info("list");
        model.addAttribute("list", service.getList());
    }

    // 새 글 등록
    @GetMapping("/create")
    public void create() {
        log.info("create");
    }

    // 새 글 등록
    @PostMapping("/create")
    public String create(BoardDTO boardDTO) {
        log.info("create: " + boardDTO);
        service.create(boardDTO);
        return "redirect:/board/list";
    }

    // 상세 조회, 글 수정
    @GetMapping({"/get", "/update"})
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("/get or /update");
        model.addAttribute("board", service.read(no));
    }

    // 글 수정
    @PostMapping("/update")
    public String update(@RequestParam BoardDTO boardDTO) {
        log.info("update: " + boardDTO);
        service.update(boardDTO);
        return "redirect:/board/list";
    }

    // 글 삭제
    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no) {
        log.info("delete: " + no);
        service.delete(no);
        return "redirect:/board/list";
    }
}

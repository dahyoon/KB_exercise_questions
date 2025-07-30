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
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    final private BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        log.info("list");
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/create")
    public void create() {
        log.info("create");
    }

    @PostMapping("/create")
    public String create(BoardDTO boardDTO) {
        log.info("create: " + boardDTO);
        service.create(boardDTO);
        return "redirect:/board/list";
    }

    // 상세 글 조회
    @GetMapping(path = { "/get", "/update"})
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("get: " + no);
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

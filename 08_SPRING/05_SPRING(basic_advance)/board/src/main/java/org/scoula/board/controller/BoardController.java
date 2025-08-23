package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.scoula.common.util.UploadFiles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

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
    public String create(BoardDTO boardDTO, RedirectAttributes ra) {
        log.info("create: " + boardDTO);
        service.create(boardDTO);
        ra.addFlashAttribute("result", boardDTO.getNo())
        ;        return "redirect:/board/list";
    }

    // 상세 글 조회
    @GetMapping(path = { "/get", "/update"})
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("get: " + no);
        model.addAttribute("board", service.read(no));
    }

    // 글 수정
    @PostMapping("/update")
    public String update(BoardDTO boardDTO, RedirectAttributes ra) {
        log.info("update: " + boardDTO);
        if (service.update(boardDTO)) {
            ra.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }

    // 글 삭제
    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no) {
        log.info("delete: " + no);
        service.delete(no);
        return "redirect:/board/list";
    }

    // 파일 다운로드
    @GetMapping("/download/{no}")
    @ResponseBody // view를 사용하지 않고 직접 응답
    public void download(@PathVariable("no") Long no, HttpServletResponse resp) throws Exception {
        BoardAttachmentVO attach = service.getAttachment(no);
        File file = new File(attach.getPath());
        UploadFiles.download(resp, file, attach.getFilename());
    }
}
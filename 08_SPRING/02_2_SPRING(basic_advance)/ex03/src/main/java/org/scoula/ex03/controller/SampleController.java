package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.SampleDTOList;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {
    // url: /sample
    @RequestMapping("")
    public void basic() {
        log.info("basic.............");
    }

    // url: /sample/basic
    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
    public void basicGet() {
        log.info("basic get.............");
    }

    // url: /sample/basicOnlyGet
    @GetMapping("/basicOnlyGet")
    public void basicOnlyGet() {
        log.info("basic get only get.............");
    }

    // url: /sample/ex01
    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }

    // url: /sample/ex02
    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name,
                       @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }

    // url: /sample/ex02List
    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
        log.info("ids: " + ids); // ids: [111, 222, 333]
        return "ex02List"; // http://localhost:8090/sample/ex02List?ids=111&ids=222&ids=333
    }

    // url: /sample/ex02Array
    @GetMapping("/ex02Array")
    public String ex02Array(@RequestParam("ids") String[] ids) {
        log.info("array ids: " + ids); // array ids: [Ljava.lang.String;@19986aff
        return "ex02Array"; // http://localhost:8090/sample/ex02Array?ids=111&ids=222&ids=333
    }

    // url: /sample/ex02Bean
    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list) {
        log.info("list dtos: " + list);
        return "ex02Bean";
    }

    // url: /sample/ex03
    @GetMapping("/ex03")
    public String ex03(TodoDTO todo) {
        log.info("todo: " + todo);
        return "ex03";
    }

    // url: /sample/ex04
    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);
        return "sample/ex04";
    }

    // url: /sample/ex05
    @GetMapping("/ex05")
    public void ex05() {
        log.info("/ex05......");
    }

    // url: /sample/ex06
    @GetMapping("/ex06")
    public String ex06(RedirectAttributes ra) {
        log.info("/ex06......");
        ra.addAttribute("name", "안다윤");
        ra.addAttribute("age", 20);
        return "redirect:/sample/ex06-2";
    }

    // url: /sample/ex07
    @GetMapping("/ex07")
    public @ResponseBody SampleDTO ex07() {
        log.info("ex07......");
        SampleDTO dto = new SampleDTO();
        dto.setAge(20);
        dto.setName("안다고");
        return dto;
    }
    
    // url: /sample/ex08
    @GetMapping("/ex08")
    public ResponseEntity<String> ex08() {
        log.info("ex08......");
        // {"name": "안다윤"}
        String msg = "{\"name\": \"안다윤\"}";
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json;charset=UTF-8");
        return new ResponseEntity<>(msg, header, HttpStatus.OK);
    }

    // url: /sample/exUpload
    @GetMapping("/exUpload")
    public void exUpload() {
        log.info("/exUpload......");
    }

    // url: /sample/exUploadPost
    @PostMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        for (MultipartFile file : files) {
            log.info("---------------------");
            log.info("name: " + file.getOriginalFilename()); // Windows OS: 한글명은 깨짐
            log.info("size: " + file.getSize());
        }
    }
}
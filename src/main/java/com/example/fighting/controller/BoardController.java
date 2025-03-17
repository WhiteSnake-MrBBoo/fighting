package com.example.fighting.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/board")

public class BoardController {

    //Board 등록페이지 보여주기 get방식
    @GetMapping("/register")
    public ResponseEntity registerGet() {

        return null;
    }

    //Board 등록페이지 입력
    @PostMapping("/register")
    public ResponseEntity postregister() {

        return null;
    }


    //Board 목록  - 리스트
    @GetMapping("/list")
    public ResponseEntity listGet() {

        return null;
    }

    //Board 읽기 - read
    @GetMapping("/read")
    public String readGet() {

        return "board/read";
    }






}

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
@RequestMapping("/reply")
public class ReplyController {


    //Reply 등록페이지 보여주기 get방식
    @GetMapping("/register")
    public ResponseEntity registerGet() {

        return null;
    }

    //Reply 등록페이지 입력
    @PostMapping("/register")
    public ResponseEntity registerPost() {

        return null;
    }


    //Reply 목록 get방식
    @GetMapping("/list")
    public ResponseEntity listGet() {

        return null;
    }





}

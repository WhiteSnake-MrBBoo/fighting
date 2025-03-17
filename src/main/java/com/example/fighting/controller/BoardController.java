package com.example.fighting.controller;


import com.example.fighting.dto.BoardDTO;
import com.example.fighting.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
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

    private final BoardService boardService;



    //Board 등록페이지 보여주기 get방식
    @GetMapping("/register")
    public String registerGet(BoardDTO boardDTO) {

        return "board/register";
    }

    //Board 등록페이지 입력
    @PostMapping("/register")
    public String postregister(BoardDTO boardDTO) {

        log.info("Board DTO Post 방식 : " + boardDTO);

        //서비스에서 가져온 저장 메서드
        boardService.resgister(boardDTO);
        return null;


    }


    //Board 목록  - 리스트
    @GetMapping("/list")
    public String listGet() {

        return null;
    }

    //Board 읽기 - read
    @GetMapping("/read")
    public String readGet() {

        return null;
    }






}

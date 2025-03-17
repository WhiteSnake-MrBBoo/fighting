package com.example.fighting.controller;


import com.example.fighting.dto.ReplyDTO;
import com.example.fighting.repository.ReplyRepository;
import com.example.fighting.service.ReplyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/reply")
public class ReplyController {

    private final ReplyService replyService;


    //Reply 등록페이지 보여주기 get방식
//    @GetMapping("/register")
//    public ResponseEntity registerGet() {
//
//        return null;
//    }  // rest방식에 불필요 삭제

    //Reply 등록페이지 입력
    @PostMapping("/register")
    public ResponseEntity registerPost(ReplyDTO replyDTO) {

        log.info(replyDTO);
        log.info(replyDTO);
        log.info(replyDTO);
        log.info(replyDTO);
        if(replyDTO.getBno() == null) {
            return new ResponseEntity<String>("잘못된 등록입니다", HttpStatus.BAD_REQUEST);
        }

        replyService.register(replyDTO);

        return new ResponseEntity<String>("등록되었습니다.", HttpStatus.OK);
    }


    //Reply 목록 get방식
    @GetMapping("/list")
    public ResponseEntity listGet() {


        List<ReplyDTO> replyDTOList =
        replyService.list();



        return new ResponseEntity<List<ReplyDTO>>(replyDTOList, HttpStatus.OK);
    }





}

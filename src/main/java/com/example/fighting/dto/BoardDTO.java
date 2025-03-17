package com.example.fighting.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BoardDTO {


    private Long bno;

    //게시판 제목
    private String title;

    //게시판 내용
    private String content;

    //게시판 작성자
    private String writer;

    //DTO 등록 날짜
    private LocalDateTime regTime;



}
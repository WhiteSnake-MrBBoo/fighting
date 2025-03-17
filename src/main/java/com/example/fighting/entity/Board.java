package com.example.fighting.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_bno")
    private Long bno;

    //게시판 제목
    private String title;

    //게시판 내용
    private String content;

    //게시판 작성자
    private String writer;



}

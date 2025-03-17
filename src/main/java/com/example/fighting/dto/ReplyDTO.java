package com.example.fighting.dto;


import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReplyDTO {


    private Long rno;

    //리플내용
    private String replyText;

    //리플작성자
    private String writer;

    //등록날짜 - DTO
    private LocalDateTime regTime;

}

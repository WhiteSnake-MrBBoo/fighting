package com.example.fighting.entity;


import com.example.fighting.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Reply extends BaseEntity{

    //pk
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_rno" )
    private Long rno;

    //리플내용
    private String replyText;

    //리플작성자
    private String writer;

    @ManyToOne
    @JoinColumn(name = "board_bno")
    private Board boardDTO;







}

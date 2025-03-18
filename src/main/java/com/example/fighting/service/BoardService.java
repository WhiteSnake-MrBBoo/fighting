package com.example.fighting.service;

import com.example.fighting.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {
    //Board (게시판)

    //등록 - @builder
    public void resgister(BoardDTO boardDTO);

    //등록 - Modelmapper
    public BoardDTO registerA(BoardDTO boardDTO);


    //목록 - List
    public List<BoardDTO> getList();

    //읽기 - Read
    public BoardDTO read(Long bno);




}

package com.example.fighting.service;

import com.example.fighting.dto.BoardDTO;
import com.example.fighting.entity.Board;
import com.example.fighting.repository.BoardRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Autowired
    private  final BoardRespository boardRespository ;


    @Override
    public void resgister(BoardDTO boardDTO) {
        //Entity 변환 작업

        Board board = Board.builder()
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent())
                .writer(boardDTO.getWriter())
                .build();

        log.info("Board Entity 에 값이 들어 왓니 " + board);   //entity 에 값이 들어 왔는지 여부 확인하기
        boardRespository.save(board);


    }

    @Override
    public List<BoardDTO> getList(String keyword) {
        return List.of();
    }

    @Override
    public BoardDTO read(Long bno) {
        return null;
    }
}

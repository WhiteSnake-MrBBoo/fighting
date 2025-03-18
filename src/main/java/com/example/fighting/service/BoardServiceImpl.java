package com.example.fighting.service;

import com.example.fighting.dto.BoardDTO;
import com.example.fighting.entity.Board;
import com.example.fighting.repository.BoardRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Autowired
    private  final BoardRespository boardRespository ;

    private ModelMapper modelMapper = new ModelMapper();





    @Override
    public BoardDTO registerA(BoardDTO boardDTO) {

        Board board = modelMapper.map(boardDTO, Board.class);

        board =
                boardRespository.save(board);

        boardDTO = modelMapper.map(board, BoardDTO.class);




        return boardDTO;
    }



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
    public List<BoardDTO> getList() {
        //entity 리스트로 받아서 변환 하기
        List<Board> boardList =
                boardRespository.findAll();


        //DTO 리스트로 변환
        List<BoardDTO> boardDTOList = new ArrayList<>();

        //entity 리스트로 된걸 리스트로 엔티티에 반환
        for (Board board:boardList){

            BoardDTO boardDTO1 = modelMapper.map(board,BoardDTO.class);

            boardDTOList.add(boardDTO1);

        }


        return boardDTOList;
    }

    @Override
    public BoardDTO read(Long bno) {
        Optional<Board> optionalBoard =
                boardRespository.findById(bno);

        Board board =
                optionalBoard.get();

        BoardDTO boardDTO = modelMapper.map(board, BoardDTO.class);


        return boardDTO;
    }
}

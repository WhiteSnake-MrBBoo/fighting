package com.example.fighting.service;


import com.example.fighting.dto.ReplyDTO;
import com.example.fighting.entity.Board;
import com.example.fighting.entity.Reply;
import com.example.fighting.repository.BoardRespository;
import com.example.fighting.repository.ReplyRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class ReplyService {

    private final BoardRespository boardRespository;
    private final ReplyRepository replyRepository;

    public void register(ReplyDTO replyDTO){


        //부모 찾기

        Board board =
        boardRespository.findById(replyDTO.getBno()).orElseThrow(EntityNotFoundException::new);

        Reply reply = Reply.builder()
                .replyText(replyDTO.getReplyText())
                .writer(replyDTO.getWriter())
                .board(board)
                .build();

        replyRepository.save(reply);

    }
    public List<ReplyDTO> list(Long bno){

        List<Reply> replyList =
        replyRepository.findByBoardBno(bno);

        List<ReplyDTO> replyDTOList = new ArrayList<>();
        if(replyList == null) {
            return null;
        }

        for (Reply reply : replyList) {

            ReplyDTO replyDTO =ReplyDTO.builder()
                    .rno(  reply.getRno())
                    .replyText( reply.getReplyText())
                    .writer(  reply.getWriter())
                    .regTime( reply.getRegTime())
                    .build();

            replyDTOList.add(replyDTO);
        }
        return replyDTOList;

    }



}

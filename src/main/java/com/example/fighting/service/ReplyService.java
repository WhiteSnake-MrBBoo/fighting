package com.example.fighting.service;


import com.example.fighting.dto.ReplyDTO;
import com.example.fighting.entity.Reply;
import com.example.fighting.repository.BoardRespository;
import com.example.fighting.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyService {

    private final BoardRespository boardRespository;
    private final ReplyRepository replyRepository;

    public void register(){

    }
    public List<ReplyDTO> list(){

        List<Reply> replyList =
        replyRepository.findAll();

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

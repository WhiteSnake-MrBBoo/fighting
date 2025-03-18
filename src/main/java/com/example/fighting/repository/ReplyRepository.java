package com.example.fighting.repository;

import com.example.fighting.dto.ReplyDTO;
import com.example.fighting.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply,Long> {

    public List<Reply> findByBoardBno(Long bno);


}

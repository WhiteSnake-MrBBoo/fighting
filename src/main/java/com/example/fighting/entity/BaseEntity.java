package com.example.fighting.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
public class BaseEntity {

    //spring data jpa의 auditingEntityListener를 지정함으로써
    // 엔티티가 데이베이스에 추가되거나 , 변경될때 자동으로 입력, 변경된다.

    //@EnableJpaAuditing 을 main에 추가

    @CreatedDate
    @Column(updatable = false)  //수정시 데이터베이스 미반영
    private LocalDateTime regTime;      //등록일



}

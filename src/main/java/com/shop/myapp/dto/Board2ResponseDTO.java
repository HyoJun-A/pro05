package com.shop.myapp.dto;

import com.shop.myapp.entity.Board2;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Board2ResponseDTO {
    private Long id; //PK(글번호)
    private String title; //제목
    private String content; //내용
    private String writer; //작성자
    private int hits;   //조회 수
    private char deleteYn;  //삭제 여부
    private LocalDateTime createDate; //생성일
    private LocalDateTime modifiedDate; //수정일

    public Board2ResponseDTO(Board2 entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.writer = entity.getWriter();
        this.hits = entity.getHits();
        this.deleteYn = entity.getDeleteYn();
        this.createDate = entity.getCreateDate();
        this.modifiedDate = entity.getModifiedDate();
    }

}

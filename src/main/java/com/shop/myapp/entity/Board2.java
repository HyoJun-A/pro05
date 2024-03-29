package com.shop.myapp.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK(글번호)
    private String title; //제목
    private String content; //내용
    private String writer; //작성자
    private int hits;   //조회 수
    private char deleteYn;  //삭제 여부
    private LocalDateTime createDate = LocalDateTime.now(); //생성일
    private LocalDateTime modifiedDate; //수정일

    //추가
    @Builder
    public Board2(String title, String content, String writer, int hits, char deleteYn) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.hits = hits;
        this.deleteYn = deleteYn;
    }

    //수정
    public void update(String title, String content, String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.modifiedDate = LocalDateTime.now();
    }
}

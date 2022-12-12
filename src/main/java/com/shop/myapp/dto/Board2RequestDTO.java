package com.shop.myapp.dto;

import com.shop.myapp.entity.Board2;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board2RequestDTO {
    private String title; //제목
    private String content; //내용
    private String writer; //작성자
    private char deleteYn;  //삭제 여부

    //글 등록, 글 수정 데이터를 받는 개체(Entity)
    public Board2 toEntity() {
        return Board2.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .hits(0)
                .deleteYn(deleteYn)
                .build();
    }
}


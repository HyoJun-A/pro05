package com.shop.myapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//TODO 공지사항
public class BoardDTO {
    private int bno;
    private String title;
    private String content;
    private String regdate;
    private int visited;
}

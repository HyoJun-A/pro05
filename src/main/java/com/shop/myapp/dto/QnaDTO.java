package com.shop.myapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class QnaDTO {
    private int qno;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createDate; //생성일
    private LocalDateTime modifiedDate; //수정일
    private int lev;
    private int parno;

}

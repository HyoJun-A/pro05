package com.shop.myapp.service;

import com.shop.myapp.dto.QnaDTO;

import java.util.List;

public interface QnaService {
    public List<QnaDTO> qnaList() throws Exception;

    public QnaDTO qnaAdd(QnaDTO qnaDTO) throws Exception;
}

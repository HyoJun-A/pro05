package com.shop.myapp.service;

import com.shop.myapp.dto.QnaDTO;
import com.shop.myapp.repository.QnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaServiceImpl implements QnaService{
    @Autowired
    QnaRepository qnaMapper;

    @Override
    public List<QnaDTO> qnaList() throws Exception {
        return qnaMapper.qnaList();
    }

    @Override
    public QnaDTO qnaAdd(QnaDTO qnaDTO) throws Exception {
        return qnaMapper.qnaAdd(qnaDTO);
    }
}

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
    public QnaDTO qnaAdd(String author, String title, String content) throws Exception {
        return qnaMapper.qnaAdd(author, title, content);
    }

    @Override
    public QnaDTO qnaDetail(int qno) throws Exception {
        return qnaMapper.qnaDetail(qno);
    }

    @Override
    public void qnaDel(int qno) throws Exception {
        qnaMapper.qnaDel(qno);
    }

    @Override
    public void qnaEdit(int qno, String title, String content) throws Exception {
        qnaMapper.qnaEdit(qno, title, content);
    }

    @Override
    public QnaDTO qnaAnswer(String author, String title, String content, int qno) throws Exception {
        return qnaMapper.qnaAnswer(author, title, content, qno);
    }
}

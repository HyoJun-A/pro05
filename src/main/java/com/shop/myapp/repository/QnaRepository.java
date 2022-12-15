package com.shop.myapp.repository;

import com.shop.myapp.dto.QnaDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QnaRepository {
    public List<QnaDTO> qnaList() throws Exception;

    public QnaDTO qnaAdd(String author, String title, String content) throws Exception;

    public QnaDTO qnaDetail(int qno) throws Exception;

    public void qnaDel(int qno) throws Exception;

    public void qnaEdit(int qno, String title, String content) throws Exception;

    public QnaDTO qnaAnswer(String author, String title, String content, int qno) throws Exception;
}

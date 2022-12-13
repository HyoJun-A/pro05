package com.shop.myapp.repository;

import com.shop.myapp.dto.QnaDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QnaRepository {
    public List<QnaDTO> qnaList() throws Exception;

    public QnaDTO qnaAdd(QnaDTO qnaDTO) throws Exception;
}

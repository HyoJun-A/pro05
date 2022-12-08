package com.shop.myapp.repository;

import com.shop.myapp.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardRepository {
    public List<BoardDTO> boardList() throws Exception;
}

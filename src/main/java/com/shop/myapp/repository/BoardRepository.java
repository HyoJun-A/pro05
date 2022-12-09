package com.shop.myapp.repository;

import com.shop.myapp.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardRepository {
    public List<BoardDTO> boardList() throws Exception;
    public BoardDTO boardDetail(int bno) throws Exception;
    public void visited(int bno) throws Exception;
    public void boardAdd(String title, String content) throws Exception;
    public void boardDel(int bno) throws Exception;
}

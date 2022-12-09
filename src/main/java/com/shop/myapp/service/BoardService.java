package com.shop.myapp.service;

import com.shop.myapp.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> boardList() throws Exception;
    public BoardDTO boardDetail(int bno) throws Exception;
    public void visited(int bno) throws Exception;
    public void boardAdd(String title, String content) throws Exception;
    public void boardDel(int bno) throws Exception;
}

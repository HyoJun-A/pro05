package com.shop.myapp.service;

import com.shop.myapp.dto.BoardDTO;
import com.shop.myapp.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository boardMapper;

    @Override
    public List<BoardDTO> boardList() throws Exception {
        return boardMapper.boardList();
    }

    @Override
    public BoardDTO boardDetail(int bno) throws Exception {
        return boardMapper.boardDetail(bno);
    }

    @Override
    public void visited(int bno) throws Exception {
        boardMapper.visited(bno);
    }

    @Override
    public void boardAdd(String title, String content) throws Exception {
        boardMapper.boardAdd(title, content);
    }

    @Override
    public void boardDel(int bno) throws Exception {
        boardMapper.boardDel(bno);
    }

    @Override
    public void boardEdit(String title, String content, int bno) throws Exception {
        boardMapper.boardEdit(title, content, bno);
    }
}

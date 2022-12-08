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
}

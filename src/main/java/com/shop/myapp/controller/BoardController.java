package com.shop.myapp.controller;

import com.shop.myapp.dto.BoardDTO;
import com.shop.myapp.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("list.do")
    public String boardList(Model model) throws Exception{
        List<BoardDTO> boardList = boardService.boardList();
        model.addAttribute("list", boardList);
        return "board/boardList";
    }

}

package com.shop.myapp.controller;

import com.shop.myapp.dto.BoardDTO;
import com.shop.myapp.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("detail.do")
    public String boardDetail(@RequestParam("bno") int bno, Model model) throws Exception{
        boardService.visited(bno);
        BoardDTO dto = boardService.boardDetail(bno);
        model.addAttribute("dto", dto);
        return "board/boardDetail";
    }

    @GetMapping("addForm.do")
    public String boardAddForm() throws Exception {
        return "board/boardAdd";
    }

    @PostMapping("add.do")
    public String boardAdd(@RequestParam("title") String title, @RequestParam("content") String content, Model model) throws Exception {
        boardService.boardAdd(title, content);

        List<BoardDTO> boardList = boardService.boardList();
        model.addAttribute("list", boardList);
        return "board/boardList";
    }

    @GetMapping("del.do")
    public String boardDel(@RequestParam("bno") int bno, Model model) throws Exception{
        boardService.boardDel(bno);

        List<BoardDTO> boardList = boardService.boardList();
        model.addAttribute("list", boardList);
        return "board/boardList";
    }

    @GetMapping("editForm")
    public String boardEditForm(@RequestParam("bno") int bno, Model model) throws Exception {
        BoardDTO dto = boardService.boardDetail(bno);
        model.addAttribute("dto", dto);
        return "board/boardEdit";
    }
}

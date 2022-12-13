package com.shop.myapp.controller;

import com.shop.myapp.dto.QnaDTO;
import com.shop.myapp.service.QnaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/qna/")
public class QnaController {

    @Autowired
    QnaService qnaService;

    @GetMapping("list.do")
    public String qnaList(Model model) throws Exception {
        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }

    @GetMapping("addForm.do")
    public String qnaAddForm() throws Exception {
        return "qna/qnaAdd";
    }

    @PostMapping("add.do")
    public String qnaAdd(QnaDTO qnaDTO, Model model) throws Exception {
        qnaService.qnaAdd(qnaDTO);

        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }
}

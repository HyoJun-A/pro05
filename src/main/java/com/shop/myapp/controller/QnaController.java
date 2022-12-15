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
import org.springframework.web.bind.annotation.RequestParam;

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
    public String qnaAdd(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("content") String content, Model model) throws Exception {
        qnaService.qnaAdd(author, title, content);

        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }

    @GetMapping("detail.do")
    public String qnaDetail(@RequestParam("qno") int qno, Model model) throws Exception {
        QnaDTO dto = qnaService.qnaDetail(qno);
        model.addAttribute("dto", dto);
        return "qna/qnaDetail";
    }

    @GetMapping("del.do")
    public String qnaDel(@RequestParam("qno") int qno, Model model) throws Exception{
        qnaService.qnaDel(qno);

        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }

    @GetMapping("editForm.do")
    public String editForm(@RequestParam("qno") int qno, Model model) throws Exception {
        QnaDTO dto = qnaService.qnaDetail(qno);
        model.addAttribute("dto", dto);
        return "qna/qnaEdit";
    }

    @PostMapping("edit.do")
    public String qnaEdit(@RequestParam("qno") int qno, @RequestParam("title") String title, @RequestParam("content") String content, Model model) throws Exception {
        qnaService.qnaEdit(qno, title, content);

        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }

    @GetMapping("answerForm.do")
    public String answerForm(@RequestParam("qno") int qno, Model model) throws Exception {
        model.addAttribute("qno", qno);
        return "qna/qnaAnswer";
    }

    @PostMapping("answer.do")
    public String qnaAnswer(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("qno") int qno, Model model) throws Exception {
        qnaService.qnaAnswer(author, title, content, qno);

        List<QnaDTO> qnaList = qnaService.qnaList();
        model.addAttribute("list", qnaList);
        return "qna/qnaList";
    }
}

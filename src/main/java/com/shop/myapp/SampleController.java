package com.shop.myapp;

import com.shop.dto.SampleDTO;
import com.shop.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sample/")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("test.do")
    public String SampleTest(Model model) throws Exception {
        List<SampleDTO> sList = sampleService.sampleTest();
        model.addAttribute("sList", sList);
        return "/sample/sampleTest";
    }
}

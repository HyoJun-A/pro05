package com.shop.myapp.controller;

import com.shop.myapp.dto.SampleDTO;
import com.shop.myapp.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/sample/")
public class SampleController {

    SampleService sampleService;

    @GetMapping("test1")
    @ResponseBody
    public String test1() {
        return "Hello Spring Boot Test1";
    }

    @GetMapping("test2")
    @ResponseBody
    public List<SampleDTO> getSample() {
        return sampleService.getSample();
    }

    @GetMapping("test3")
    public String test3(Model model) {
        model.addAttribute("thy1", "타임리프 사용하기 1");
        return "/sample/test3";
    }

    @GetMapping("test4")
    public String test4(Model model) {
        SampleDTO dto = new SampleDTO("ahj", "1234");
        model.addAttribute("dto", dto);
        return "/sample/test4";
    }

    @GetMapping("test5")
    public String test5(){
        return "/sample/test5";
    }

    @GetMapping("test6")
    public String test6(Model model){
        List<SampleDTO> sampleList = sampleService.getSample();
        model.addAttribute("sampleList", sampleList);
        return "/sample/test6";
    }

    @GetMapping("test7")
    public String test7(Model model){
        List<SampleDTO> sampleList = sampleService.getSample();
        model.addAttribute("sampleList", sampleList);
        return "/sample/test7";
    }

    @GetMapping("test8")
    public String test8(Model model){
        SampleDTO sample = new SampleDTO("ahj", "1234");
        List<String> genderList = new ArrayList<String>();
        genderList.add("M");
        genderList.add("F");
        model.addAttribute("gender", "F");
        model.addAttribute("genderList", genderList);
        model.addAttribute("sample", sample);
        return "/sample/test8";
    }

    @GetMapping("test9")
    public String test9(Model model) {
        return "/sample/test9";
    }

    /*@GetMapping("test10")
    public String test10(RequestParam("id") String id, Model model) throws Exception{
        SampleDTO dto = sampleService.getOneSample("id");
        model.addAttribute("dto", dto);
        return "/sample/test10";
    }*/
}

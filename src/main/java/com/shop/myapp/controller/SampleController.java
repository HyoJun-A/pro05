package com.shop.myapp.controller;

import com.shop.myapp.dto.SampleDTO;
import com.shop.myapp.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class SampleController {

    SampleService sampleService;

    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        return "Hello Spring Boot Test1";
    }

    @GetMapping("/sample")
    @ResponseBody
    public List<SampleDTO> getSample() {
        return sampleService.getSample();
    }
}

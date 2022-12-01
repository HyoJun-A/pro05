package com.shop.myapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/main")
    @ResponseBody
    public String goMain(HttpServletRequest request){
        return "Ok Spring Boot Main";
    }

    @GetMapping("/home")
    @ResponseBody
    public String goHome(HttpServletRequest request){
        System.out.println("OK~!");
        return "Hello Spring Boot";
    }

}

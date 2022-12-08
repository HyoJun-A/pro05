package com.shop.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user/")
public class MemberController {

    @GetMapping("login.do")
    public String loginForm() throws Exception {
        return "/member/login";
    }
}
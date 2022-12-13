package com.shop.myapp.controller;

import com.shop.myapp.dto.MemberDTO;
import com.shop.myapp.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@AllArgsConstructor
public class MemberController {

    private MemberService memberService;

    @GetMapping("/member/loginForm.do")
    public String loginForm() throws Exception {
        return "/member/login";
    }


    // 로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin() {
        return "/member/login";
    }

    // 로그인 결과 페이지
    @PostMapping("/user/login/result")
    public String dispLoginResult(@RequestParam("id") String id, @RequestParam("pw") String pw,Model model) {
        model.addAttribute("id", id);
        return "/index";
    }

    //회원 가입
    @GetMapping("/member/agree.do")
    public String agreeForm() throws Exception {
        return "/member/agree";
    }

    @GetMapping("/member/signup.do")
    public String signupForm() throws Exception {
        return "/member/signup";
    }

    @PostMapping("/member/signUp.do")
    public String execSignup(MemberDTO memberDTO) {
        memberService.joinUser(memberDTO);
        return "/member/login";
    }
}

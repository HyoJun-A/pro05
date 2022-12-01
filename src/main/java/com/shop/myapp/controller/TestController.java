package com.shop.myapp.controller;

import com.shop.myapp.domain.TestEntity;
import com.shop.myapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/all")
    public ResponseEntity<List<TestEntity>> getTest(){
        List<TestEntity> testList = testService.findAll();
        return new ResponseEntity<List<TestEntity>>(testList, HttpStatus.OK);
        //ResponseEntity : HTTP응답을 빠르게 만들어 주기 위한 객체
        //@ResponseBody 와 달리 Annotation이 아닌 객체로 사용이 된다.
        //-> 응답으로 변환될 정보들을 모두 객체로만들어서 반환
    }

    @GetMapping("/one")
    public ResponseEntity<List<TestEntity>> getFindTest() {
        List<TestEntity> findList = testService.findByPw("0000");
        return new ResponseEntity<List<TestEntity>>(findList, HttpStatus.OK);
    }
}

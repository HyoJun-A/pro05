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

    @GetMapping("/jpa")
    public ResponseEntity<List<TestEntity>> getTest(){
        List<TestEntity> testList = testService.findAll();
        return new ResponseEntity<List<TestEntity>>(testList, HttpStatus.OK);
    }
}

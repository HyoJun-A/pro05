package com.shop.myapp.service;

import com.shop.myapp.domain.TestEntity;
import com.shop.myapp.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestEntity> findAll() {
        List<TestEntity> testList = new ArrayList<>();
        testRepository.findAll().forEach(e -> testList.add(e));
        return testList;
    }

    public List<TestEntity> findByPw(String pw) {
        List<TestEntity> findList = testRepository.findByPw(pw);
        return findList;
    }

}

package com.shop.myapp.repository;

import com.shop.myapp.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, String> {

    public List<TestEntity> findByPw(String pw);

}

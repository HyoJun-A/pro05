package com.shop.myapp.repository;

import com.shop.myapp.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public interface TestRepository extends JpaRepository<TestEntity, String> {

    //find(select), delete(delete), save(insert)

    //select * from where pw = ?
    public List<TestEntity> findByPw(String pw);

    //delete from "Table Name" where id = ?
    public void deleteById(String id);

    //insert into "DB Name" values();
    TestEntity save(TestEntity testEntity);





}

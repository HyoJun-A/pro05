package com.shop.repository;

import com.shop.dto.SampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public class SampleRepositoryImpl implements SampleRepository{

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<SampleDTO> sampleTest() throws Exception {
        return sqlSession.selectList("sample.test");
    }
}

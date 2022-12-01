package com.shop.myapp.repository;

import com.shop.myapp.dto.SampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SampleRepository {
    List<SampleDTO> getSample();
}

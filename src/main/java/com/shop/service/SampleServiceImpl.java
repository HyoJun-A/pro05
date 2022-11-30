package com.shop.service;

import com.shop.dto.SampleDTO;
import com.shop.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl  implements SampleService {

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public List<SampleDTO> sampleTest() throws Exception {
        return sampleRepository.sampleTest();
    }
}

package com.shop.myapp.service;

import com.shop.myapp.dto.SampleDTO;
import com.shop.myapp.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl  implements SampleService {

//    @Autowired
//    SampleRepository sampleMapper;
    private final SampleRepository sampleMapper;

    @Override
    public List<SampleDTO> getSample() {
        return sampleMapper.getSample();
    }
}

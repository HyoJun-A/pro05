package com.shop.myapp.service;

import com.shop.myapp.dto.Board2RequestDTO;
import com.shop.myapp.dto.Board2ResponseDTO;
import com.shop.myapp.entity.Board2;
import com.shop.myapp.repository.Board2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Board2Service {

    private final Board2Repository board2Repository;

    //글 등록
    @Transactional
    public Long save(final Board2RequestDTO params) {
        Board2 entity = board2Repository.save(params.toEntity());
        return entity.getId();
    }

    //글 목록
    public List<Board2ResponseDTO>  findAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id", "createDate");
        List<Board2> list = board2Repository.findAll(sort);
        return list.stream().map(Board2ResponseDTO::new).collect(Collectors.toList());
    }

    //글 수정
    public Long update(final Long id, Board2RequestDTO params){
        Board2 entity = board2Repository.findById(id).orElseThrow(() -> new RuntimeException(""));
        entity.update(params.getTitle(), params.getContent(), params.getWriter());
        return id;
    }
}

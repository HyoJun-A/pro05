package com.shop.myapp.test;

import com.shop.myapp.dto.Board2RequestDTO;
import com.shop.myapp.entity.Board2;
import com.shop.myapp.repository.Board2Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Board2TestsTest {
    @Autowired
    Board2Repository board2Repository;

    @Test
    void save() {
        Board2 params = Board2.builder()
                .title("더미데이터 제목")
                .content("더미데이터 내용")
                .writer("안효준")
                .hits(0)
                .deleteYn('Y')
                .build();
        board2Repository.save(params);
    }

    @Test
    void loadingDate() {
        Board2 entity = board2Repository.findById((long) 2).get();
    }

    @Test
    void findAll(){
        long boardsCount2 = board2Repository.count();
        List<Board2> board2s = board2Repository.findAll();
    }

    @Test
    void delete(){
        Board2 entity = board2Repository.findById((long) 2).get();
        board2Repository.delete(entity);
    }

    @Test
    void update(final Long id, Board2RequestDTO params) {
        Board2 entity = board2Repository.findById((long) 2).get();
        entity.update(params.getTitle(), params.getContent(), params.getWriter());
    }
}
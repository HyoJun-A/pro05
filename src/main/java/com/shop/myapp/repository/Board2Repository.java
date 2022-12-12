package com.shop.myapp.repository;

import com.shop.myapp.entity.Board2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Board2Repository extends JpaRepository<Board2, Long> {

}

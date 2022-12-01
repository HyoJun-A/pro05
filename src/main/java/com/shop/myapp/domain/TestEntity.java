package com.shop.myapp.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Entity(name = "test")  //teble 이름
public class TestEntity {

    @Id //기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    //@Column(length = 10, nullable = false)
    //컬럼선언
    private String pw;

    @Builder    //생성자, 정보들을 자바빈즈패턴 처럼 받되, 데이터 일관성을 위해 정보들을 다 받은 후에 객체를 생성
    public TestEntity(String id,String pw){
        this.pw = pw;
    }

}

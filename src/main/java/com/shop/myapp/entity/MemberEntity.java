package com.shop.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 50, nullable = false)
    private String id;

    @Column(length = 300, nullable = false)
    private String pw;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 200, nullable = false)
    private String addr1;

    @Column(length = 200, nullable = false)
    private String addr2;

    @Column(nullable = false)
    private int tel;

    @Builder
    public MemberEntity(Long mno, String id, String pw, String email, String addr1, String addr2, int tel) {
        this.mno = mno;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.tel = tel;
    }
}

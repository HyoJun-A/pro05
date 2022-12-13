package com.shop.myapp.dto;

import com.shop.myapp.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
    private Long mno;
    private String id;
    private String pw;
    private String email;
    private String addr1;
    private String addr2;
    private int tel;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .mno(mno)
                .id(id)
                .pw(pw)
                .email(email)
                .addr1(addr1)
                .addr2(addr2)
                .tel(tel)
                .build();
    }

//    회원가입
    @Builder
    public MemberDTO(Long mno, String id, String pw, String email, String addr1, String addr2, int tel) {
        this.mno = mno;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.tel = tel;
    }

    @Builder
    public MemberDTO(String id, String pw){
        this.id = id;
        this.pw = pw;
    }
}

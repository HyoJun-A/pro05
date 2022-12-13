package com.shop.myapp.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shop.myapp.dto.MemberDTO;
import com.shop.myapp.repository.MemberRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.myapp.entity.MemberEntity;
import com.shop.myapp.entity.Role;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {

    private MemberRepository memberRepository;

    @Transactional
    public Long joinUser(MemberDTO memberDTO) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        memberDTO.setPw(passwordEncoder.encode(memberDTO.getPw()));

        return memberRepository.save(memberDTO.toEntity()).getMno();
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<MemberEntity> userEntityWrapper = memberRepository.findById(id);
        MemberEntity userEntity = userEntityWrapper.get();

        List<GrantedAuthority> authorities = new ArrayList<>();

        if (("admin").equals(id)) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else if (id != null) {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }

        return new User(userEntity.getId(), userEntity.getPw() ,authorities);
    }

}
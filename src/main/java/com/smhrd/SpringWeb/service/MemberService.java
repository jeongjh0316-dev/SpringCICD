package com.smhrd.SpringWeb.service;

import com.smhrd.SpringWeb.dto.Cloud_Member;
import com.smhrd.SpringWeb.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    // 회원 목록 조회
    public List<Cloud_Member> memberList(){
        return repository.findAll();
    }

    // 회원등록
    public void memberInsert(Cloud_Member dto){
        repository.save(dto);
    }
    // 회원 삭제
    public void memberDelete(Long num){
        repository.deleteById(num);
    }
    // 회원 조회
    public Cloud_Member memberSelect(Long num){
        return repository.findById(num).get();
    }
    // 회원 수정
    public void memberUpdate(Cloud_Member dto){
        repository.save(dto);
    }

}

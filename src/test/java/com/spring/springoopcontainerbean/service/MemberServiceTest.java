package com.spring.springoopcontainerbean.service;

import com.spring.springoopcontainerbean.domain.Grade;
import com.spring.springoopcontainerbean.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //given
        Member member = new Member(1L,"memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertEquals(member,findMember);
    }

    @Test
    void findMember() {
    }
}
package com.spring.springoopcontainerbean;

import com.spring.springoopcontainerbean.domain.Grade;
import com.spring.springoopcontainerbean.domain.Member;
import com.spring.springoopcontainerbean.service.MemberService;
import com.spring.springoopcontainerbean.service.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);

        System.out.println("new member = "+ member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}

package com.spring.springoopcontainerbean;

import com.spring.springoopcontainerbean.discount.DiscountPolicy;
import com.spring.springoopcontainerbean.discount.FixDiscountPolicy;

import com.spring.springoopcontainerbean.repository.MemberRepository;
import com.spring.springoopcontainerbean.repository.MemoryMemberRepository;
import com.spring.springoopcontainerbean.service.MemberService;
import com.spring.springoopcontainerbean.service.MemberServiceImpl;
import com.spring.springoopcontainerbean.service.OrderService;
import com.spring.springoopcontainerbean.service.OrderServiceImpl;

public class AppConfig {
    // 생성자 주입
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}

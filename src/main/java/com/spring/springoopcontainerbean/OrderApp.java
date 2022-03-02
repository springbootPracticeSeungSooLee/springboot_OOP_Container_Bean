package com.spring.springoopcontainerbean;

import com.spring.springoopcontainerbean.domain.Grade;
import com.spring.springoopcontainerbean.domain.Member;
import com.spring.springoopcontainerbean.domain.Order;
import com.spring.springoopcontainerbean.service.MemberService;
import com.spring.springoopcontainerbean.service.MemberServiceImpl;
import com.spring.springoopcontainerbean.service.OrderService;
import com.spring.springoopcontainerbean.service.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        System.out.println("order = " + order);

    }
}

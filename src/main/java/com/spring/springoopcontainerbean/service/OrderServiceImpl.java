package com.spring.springoopcontainerbean.service;

import com.spring.springoopcontainerbean.discount.DiscountPolicy;
import com.spring.springoopcontainerbean.discount.FixDiscountPolicy;
import com.spring.springoopcontainerbean.domain.Member;
import com.spring.springoopcontainerbean.domain.Order;
import com.spring.springoopcontainerbean.repository.MemberRepository;
import com.spring.springoopcontainerbean.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        int discountItemPrice = itemPrice - discountPrice;

        Order order = Order.builder()
                .memberId(memberId)
                .itemName(itemName)
                .discountPrice(discountItemPrice)
                .build();

        return order;
    }
}

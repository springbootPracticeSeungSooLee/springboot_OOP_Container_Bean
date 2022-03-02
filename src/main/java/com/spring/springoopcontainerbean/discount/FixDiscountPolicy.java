package com.spring.springoopcontainerbean.discount;

import com.spring.springoopcontainerbean.domain.Grade;
import com.spring.springoopcontainerbean.domain.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        return 0;
    }

}

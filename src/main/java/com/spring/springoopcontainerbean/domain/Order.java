package com.spring.springoopcontainerbean.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    @Builder
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice){
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;

    }

    public int calcuatePrice(){
        return itemPrice - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}

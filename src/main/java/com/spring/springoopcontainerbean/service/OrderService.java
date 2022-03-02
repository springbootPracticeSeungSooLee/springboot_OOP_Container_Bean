package com.spring.springoopcontainerbean.service;

import com.spring.springoopcontainerbean.domain.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}

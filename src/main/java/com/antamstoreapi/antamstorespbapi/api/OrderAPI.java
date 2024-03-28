package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderAPI {
    @Autowired
    private IOrderService orderService;
}

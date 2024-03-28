package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.repository.ICartRepository;
import com.antamstoreapi.antamstorespbapi.service.cart.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carts")
public class CartAPI {
    @Autowired
    private ICartService cartService;
}

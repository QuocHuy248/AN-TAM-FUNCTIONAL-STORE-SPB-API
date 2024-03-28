package com.antamstoreapi.antamstorespbapi.service.cart;

import com.antamstoreapi.antamstorespbapi.domain.entity.Cart;
import com.antamstoreapi.antamstorespbapi.repository.ICartRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class CartServiceImpl implements ICartService{
    @Autowired
    private ICartRepository cartRepository;
    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public Optional<Cart> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Cart save(Cart cart) {
        return null;
    }

    @Override
    public void delete(Cart cart) {

    }

    @Override
    public void deleteById(String id) {

    }
}

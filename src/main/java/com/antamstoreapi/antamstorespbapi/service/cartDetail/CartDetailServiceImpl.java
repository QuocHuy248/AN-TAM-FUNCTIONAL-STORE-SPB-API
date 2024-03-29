package com.antamstoreapi.antamstorespbapi.service.cartDetail;

import com.antamstoreapi.antamstorespbapi.domain.entity.CartDetail;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.ICartDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class CartDetailServiceImpl implements ICartDetailService{
    @Autowired
    private ICartDetailRepository cartDetailRepository;
    @Override
    public List<CartDetail> findAll() {
        return null;
    }

    @Override
    public CartDetail findById(String id) {
        return null;
    }


    @Override
    public CartDetail save(CartDetail cartDetail) {
        return null;
    }

    @Override
    public void delete(CartDetail cartDetail) {

    }

    @Override
    public void deleteById(String id) {

    }
}

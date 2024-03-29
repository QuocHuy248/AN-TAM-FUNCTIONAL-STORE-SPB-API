package com.antamstoreapi.antamstorespbapi.service.order;

import com.antamstoreapi.antamstorespbapi.domain.entity.Order;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IOrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(String id) {
        return null;
    }


    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void deleteById(String id) {

    }
}

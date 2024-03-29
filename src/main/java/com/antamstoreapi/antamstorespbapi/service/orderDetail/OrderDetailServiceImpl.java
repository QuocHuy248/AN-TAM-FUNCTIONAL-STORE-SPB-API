package com.antamstoreapi.antamstorespbapi.service.orderDetail;

import com.antamstoreapi.antamstorespbapi.domain.entity.OrderDetail;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IOrderDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class OrderDetailServiceImpl implements IOrderDetailService{
    @Autowired
    private IOrderDetailRepository orderDetailRepository;
    @Override
    public List<OrderDetail> findAll() {
        return null;
    }

    @Override
    public OrderDetail findById(String id) {
        return null;
    }


    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public void delete(OrderDetail orderDetail) {

    }

    @Override
    public void deleteById(String id) {

    }
}

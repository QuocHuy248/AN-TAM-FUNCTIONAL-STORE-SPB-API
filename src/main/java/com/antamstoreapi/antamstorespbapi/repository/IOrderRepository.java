package com.antamstoreapi.antamstorespbapi.repository;

import com.antamstoreapi.antamstorespbapi.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order,String> {
}

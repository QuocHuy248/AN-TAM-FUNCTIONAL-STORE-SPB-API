package com.antamstoreapi.antamstorespbapi.service;

import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;

import java.util.List;

public interface IGeneralService <E, T>{
    List<E> findAll();

    E findById(T id);

    E save(E e);

    void delete(E e);

    void deleteById(T id);
}

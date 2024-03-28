package com.antamstoreapi.antamstorespbapi.repository;

import com.antamstoreapi.antamstorespbapi.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,String> {
}

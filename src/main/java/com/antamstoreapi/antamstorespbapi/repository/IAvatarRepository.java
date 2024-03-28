package com.antamstoreapi.antamstorespbapi.repository;


import com.antamstoreapi.antamstorespbapi.domain.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAvatarRepository extends JpaRepository<Avatar,String> {
}

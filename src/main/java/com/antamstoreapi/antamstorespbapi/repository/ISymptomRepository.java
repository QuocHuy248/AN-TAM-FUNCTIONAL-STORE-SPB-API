package com.antamstoreapi.antamstorespbapi.repository;

import com.antamstoreapi.antamstorespbapi.domain.entity.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISymptomRepository extends JpaRepository<Symptom,String> {
}

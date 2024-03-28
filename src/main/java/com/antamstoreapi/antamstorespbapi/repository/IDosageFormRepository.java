package com.antamstoreapi.antamstorespbapi.repository;

import com.antamstoreapi.antamstorespbapi.domain.entity.DosageForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDosageFormRepository extends JpaRepository<DosageForm,String> {
}

package com.antamstoreapi.antamstorespbapi.repository;

import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitResDTO;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUnitRepository extends JpaRepository<Unit,String> {
    @Query("SELECT new com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitResDTO(u.name) FROM Unit u ")
    Page<UnitResDTO> getAllUnit(Pageable pageable);
    @Query("SELECT new com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitResDTO(u.name) FROM Unit u ")
    List<UnitResDTO> getAllUnit();
}

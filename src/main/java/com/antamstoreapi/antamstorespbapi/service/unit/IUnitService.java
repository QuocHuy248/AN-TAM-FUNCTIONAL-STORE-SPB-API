package com.antamstoreapi.antamstorespbapi.service.unit;

import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitReqDTO;
import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitResDTO;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUnitService extends IGeneralService<Unit, String> {
    String createUnit(String nameUnit);

    void deleteUnitById(String idUnit);

    void updateUnitById(UnitReqDTO unit, String id);

    Page<UnitResDTO> getAllUnit(Pageable pageable);

    List<UnitResDTO> getAllUnit();
}

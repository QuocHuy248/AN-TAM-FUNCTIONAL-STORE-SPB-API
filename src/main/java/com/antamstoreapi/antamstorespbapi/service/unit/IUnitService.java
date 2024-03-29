package com.antamstoreapi.antamstorespbapi.service.unit;

import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.service.IGeneralService;

public interface IUnitService extends IGeneralService<Unit,String> {
    String createUnit(String nameUnit);
    void deleteUnitById(String idUnit);
}

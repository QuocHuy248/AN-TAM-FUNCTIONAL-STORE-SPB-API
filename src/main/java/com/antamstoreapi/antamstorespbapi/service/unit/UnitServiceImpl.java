package com.antamstoreapi.antamstorespbapi.service.unit;

import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitReqDTO;
import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitResDTO;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.exception.ResourceNotFoundException;
import com.antamstoreapi.antamstorespbapi.repository.IUnitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class UnitServiceImpl implements IUnitService {
    @Autowired
    private IUnitRepository unitRepository;

    @Override
    public List<Unit> findAll() {
        return null;
    }

    @Override
    public Unit save(Unit unit) {
        return null;
    }

    @Override
    public void delete(Unit unit) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public String createUnit(String nameUnit) {
        return unitRepository.save(new Unit(nameUnit)).getId();
    }

    @Override
    public void deleteUnitById(String idUnit) {
        Unit unit = unitRepository.findById(idUnit).orElseThrow(() ->
                new ResourceNotFoundException("Cant found Unit with this id to delete"));
        unitRepository.delete(unit);
    }

    @Override
    public void updateUnitById(UnitReqDTO req, String id) {
        Unit unit = unitRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Unit not found with this id"));
        unit.setName(req.getNameUnit());
        unitRepository.save(unit);
    }

    @Override
    public Page<UnitResDTO> getAllUnit(Pageable pageable) {
        return unitRepository.getAllUnit(pageable);
    }

    @Override
    public List<UnitResDTO> getAllUnit() {
        return unitRepository.getAllUnit();
    }

    @Override
    public Unit findById(String id) {
        return unitRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Unit not found with this id"));
    }
}

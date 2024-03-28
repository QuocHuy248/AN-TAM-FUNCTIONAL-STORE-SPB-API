package com.antamstoreapi.antamstorespbapi.service.unit;

import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IUnitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Unit> findById(String id) {
        return Optional.empty();
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
}

package com.antamstoreapi.antamstorespbapi.service.dosageForm;

import com.antamstoreapi.antamstorespbapi.domain.entity.DosageForm;
import com.antamstoreapi.antamstorespbapi.repository.IDosageFormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class DosageFormServiceImpl implements IDosageFormService{
    @Autowired
    private IDosageFormRepository dosageFormRepository;
    @Override
    public List<DosageForm> findAll() {
        return null;
    }

    @Override
    public Optional<DosageForm> findById(String id) {
        return Optional.empty();
    }

    @Override
    public DosageForm save(DosageForm dosageForm) {
        return null;
    }

    @Override
    public void delete(DosageForm dosageForm) {

    }

    @Override
    public void deleteById(String id) {

    }
}

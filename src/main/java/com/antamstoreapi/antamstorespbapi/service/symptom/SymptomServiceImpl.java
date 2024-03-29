package com.antamstoreapi.antamstorespbapi.service.symptom;

import com.antamstoreapi.antamstorespbapi.domain.entity.Symptom;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.ISymptomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SymptomServiceImpl implements ISymptomService{
    @Autowired
    private ISymptomRepository symptomRepository;
    @Override
    public List<Symptom> findAll() {
        return null;
    }

    @Override
    public Symptom findById(String id) {
        return null;
    }


    @Override
    public Symptom save(Symptom symptom) {
        return null;
    }

    @Override
    public void delete(Symptom symptom) {

    }

    @Override
    public void deleteById(String id) {

    }
}

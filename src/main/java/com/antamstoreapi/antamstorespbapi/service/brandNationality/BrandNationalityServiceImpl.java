package com.antamstoreapi.antamstorespbapi.service.brandNationality;

import com.antamstoreapi.antamstorespbapi.domain.entity.BrandNationality;
import com.antamstoreapi.antamstorespbapi.repository.IBrandNationalityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class BrandNationalityServiceImpl implements IBrandNationalityService{
    @Autowired
    private IBrandNationalityRepository brandNationalityRepository;
    @Override
    public List<BrandNationality> findAll() {
        return null;
    }

    @Override
    public Optional<BrandNationality> findById(String id) {
        return Optional.empty();
    }

    @Override
    public BrandNationality save(BrandNationality brandNationality) {
        return null;
    }

    @Override
    public void delete(BrandNationality brandNationality) {

    }

    @Override
    public void deleteById(String id) {

    }
}

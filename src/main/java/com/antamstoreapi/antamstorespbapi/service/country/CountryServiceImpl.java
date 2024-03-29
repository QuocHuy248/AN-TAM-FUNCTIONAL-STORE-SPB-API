package com.antamstoreapi.antamstorespbapi.service.country;

import com.antamstoreapi.antamstorespbapi.domain.entity.Country;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.ICountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CountryServiceImpl implements ICountryService{
    @Autowired
    private ICountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public Country findById(String id) {
        return null;
    }


    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public void delete(Country country) {

    }

    @Override
    public void deleteById(String id) {

    }
}

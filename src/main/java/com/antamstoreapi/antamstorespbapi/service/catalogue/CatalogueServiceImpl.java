package com.antamstoreapi.antamstorespbapi.service.catalogue;

import com.antamstoreapi.antamstorespbapi.domain.entity.Catalogue;
import com.antamstoreapi.antamstorespbapi.repository.ICatalogueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class CatalogueServiceImpl implements ICatalogueService{
    @Autowired
    private ICatalogueRepository catalogueRepository;
    @Override
    public List<Catalogue> findAll() {
        return null;
    }

    @Override
    public Optional<Catalogue> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Catalogue save(Catalogue catalogue) {
        return null;
    }

    @Override
    public void delete(Catalogue catalogue) {

    }

    @Override
    public void deleteById(String id) {

    }
}

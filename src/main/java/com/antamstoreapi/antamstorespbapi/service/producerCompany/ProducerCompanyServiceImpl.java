package com.antamstoreapi.antamstorespbapi.service.producerCompany;

import com.antamstoreapi.antamstorespbapi.domain.entity.ProducerCompany;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IProducerCompanyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class ProducerCompanyServiceImpl implements IProducerCompanyService{
    @Autowired
    private IProducerCompanyRepository producerCompanyRepository;
    @Override
    public List<ProducerCompany> findAll() {
        return null;
    }

    @Override
    public ProducerCompany findById(String id) {
        return null;
    }

    @Override
    public ProducerCompany save(ProducerCompany producerCompany) {
        return null;
    }

    @Override
    public void delete(ProducerCompany producerCompany) {

    }

    @Override
    public void deleteById(String id) {

    }
}

package com.antamstoreapi.antamstorespbapi.service.address;

import com.antamstoreapi.antamstorespbapi.domain.entity.Address;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IAdressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AddressServiceImpl implements IAddressService{
    @Autowired
    private IAdressRepository adressRepository;
    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(String id) {
        return null;
    }


    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public void delete(Address address) {

    }

    @Override
    public void deleteById(String id) {

    }
}

package com.antamstoreapi.antamstorespbapi.service.targetUserDetail;

import com.antamstoreapi.antamstorespbapi.domain.entity.TargetUserDetail;
import com.antamstoreapi.antamstorespbapi.repository.ITargetUserDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class TargetUserDetailServiceImpl implements ITargetUserDetailService{
    @Autowired
    private ITargetUserDetailRepository targetUserDetailRepository;
    @Override
    public List<TargetUserDetail> findAll() {
        return null;
    }

    @Override
    public Optional<TargetUserDetail> findById(String id) {
        return Optional.empty();
    }

    @Override
    public TargetUserDetail save(TargetUserDetail targetUserDetail) {
        return null;
    }

    @Override
    public void delete(TargetUserDetail targetUserDetail) {

    }

    @Override
    public void deleteById(String id) {

    }
}

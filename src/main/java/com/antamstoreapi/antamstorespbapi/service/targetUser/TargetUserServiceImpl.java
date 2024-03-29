package com.antamstoreapi.antamstorespbapi.service.targetUser;

import com.antamstoreapi.antamstorespbapi.domain.entity.TargetUser;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.ITargetUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TargetUserServiceImpl implements ITargetUserService{
    @Autowired
    private ITargetUserRepository targetUserRepository;
    @Override
    public List<TargetUser> findAll() {
        return null;
    }

    @Override
    public TargetUser findById(String id) {
        return null;
    }


    @Override
    public TargetUser save(TargetUser targetUser) {
        return null;
    }

    @Override
    public void delete(TargetUser targetUser) {

    }

    @Override
    public void deleteById(String id) {

    }
}

package com.antamstoreapi.antamstorespbapi.service.avatar;

import com.antamstoreapi.antamstorespbapi.domain.entity.Avatar;
import com.antamstoreapi.antamstorespbapi.repository.IAvatarRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class AvatarServiceImpl implements IAvatarService{
    @Autowired
    private IAvatarRepository avatarRepository;
    @Override
    public List<Avatar> findAll() {
        return null;
    }

    @Override
    public Optional<Avatar> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Avatar save(Avatar avatar) {
        return null;
    }

    @Override
    public void delete(Avatar avatar) {

    }

    @Override
    public void deleteById(String id) {

    }
}

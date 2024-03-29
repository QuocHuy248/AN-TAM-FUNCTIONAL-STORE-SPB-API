package com.antamstoreapi.antamstorespbapi.service.photoDes;

import com.antamstoreapi.antamstorespbapi.domain.entity.PhotoDes;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IPhotoDesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PhotoDesServiceImpl implements IPhotoDesService {
    @Autowired
    private IPhotoDesRepository photoDesRepository;
    @Override
    public List<PhotoDes> findAll() {
        return null;
    }

    @Override
    public PhotoDes findById(String id) {
        return null;
    }


    @Override
    public PhotoDes save(PhotoDes photoDes) {
        return null;
    }

    @Override
    public void delete(PhotoDes photoDes) {

    }

    @Override
    public void deleteById(String id) {

    }
}

package com.antamstoreapi.antamstorespbapi.service.ingredientDetail;

import com.antamstoreapi.antamstorespbapi.domain.entity.IngredientDetail;
import com.antamstoreapi.antamstorespbapi.repository.IIngredientDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class IngredientDetailImpl implements IIngredientDetailService{
    @Autowired
    private IIngredientDetailRepository ingredientDetailRepository;
    @Override
    public List<IngredientDetail> findAll() {
        return null;
    }

    @Override
    public Optional<IngredientDetail> findById(String id) {
        return Optional.empty();
    }

    @Override
    public IngredientDetail save(IngredientDetail ingredientDetail) {
        return null;
    }

    @Override
    public void delete(IngredientDetail ingredientDetail) {

    }

    @Override
    public void deleteById(String id) {

    }
}

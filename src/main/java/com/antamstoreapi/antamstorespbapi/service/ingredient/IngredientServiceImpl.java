package com.antamstoreapi.antamstorespbapi.service.ingredient;

import com.antamstoreapi.antamstorespbapi.domain.entity.Ingredient;
import com.antamstoreapi.antamstorespbapi.domain.entity.Unit;
import com.antamstoreapi.antamstorespbapi.repository.IIngredientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class IngredientServiceImpl implements IIngredientService{
    @Autowired
    private IIngredientRepository ingredientRepository;
    @Override
    public List<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient findById(String id) {
        return null;
    }


    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }

    @Override
    public void delete(Ingredient ingredient) {

    }

    @Override
    public void deleteById(String id) {

    }
}

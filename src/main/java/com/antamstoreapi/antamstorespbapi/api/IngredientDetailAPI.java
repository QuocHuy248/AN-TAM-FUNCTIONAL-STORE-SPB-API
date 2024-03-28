package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.ingredientDetail.IIngredientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ingredient-details")
public class IngredientDetailAPI {
    @Autowired
    private IIngredientDetailService ingredientDetailService;
}

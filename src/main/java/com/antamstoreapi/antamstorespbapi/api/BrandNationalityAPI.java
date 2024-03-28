package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.brandNationality.IBrandNationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brand-nationalities")
public class BrandNationalityAPI {
    @Autowired
    private IBrandNationalityService brandNationalityService;
}

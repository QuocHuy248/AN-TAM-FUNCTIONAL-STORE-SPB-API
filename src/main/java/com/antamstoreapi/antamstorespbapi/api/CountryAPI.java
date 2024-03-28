package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countries")
public class CountryAPI {
    @Autowired
    private ICountryService countryService;
}

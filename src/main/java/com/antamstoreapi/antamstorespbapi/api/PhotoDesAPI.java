package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.photoDes.IPhotoDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photo-des")
public class PhotoDesAPI {
    @Autowired
    private IPhotoDesService photoDesService;
}

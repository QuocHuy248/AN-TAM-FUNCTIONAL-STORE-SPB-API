package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.service.targetUserDetail.ITargetUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/target-user-details")
public class TargetUserDetailAPI {
    @Autowired
    private ITargetUserDetailService targetUserDetailService;
}

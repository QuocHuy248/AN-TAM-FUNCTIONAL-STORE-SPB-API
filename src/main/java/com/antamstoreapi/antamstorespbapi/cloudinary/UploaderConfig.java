package com.antamstoreapi.antamstorespbapi.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CloudinaryConfig.class)
public class UploaderConfig {
    @Autowired
    private CloudinaryConfig config;

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", config.getCloudinaryName(),
                "api_key", config.getApiKey(),
                "api_secret", config.getApiSecret()));
    }
}
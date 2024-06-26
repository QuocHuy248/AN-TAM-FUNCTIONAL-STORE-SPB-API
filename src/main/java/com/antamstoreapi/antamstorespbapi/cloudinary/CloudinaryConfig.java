package com.antamstoreapi.antamstorespbapi.cloudinary;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application.cloudinary")
@Getter
@Setter
public class CloudinaryConfig {
    @Value("${application.cloudinary.cloud-name}")
    private String cloudinaryName;
    @Value("${application.cloudinary.api-key}")
    private String apiKey;
    @Value("${application.cloudinary.api-secret}")
    private String apiSecret;
}

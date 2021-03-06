package com.xm.core;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@PropertySource(value = "classpath:application-${env}.properties")
public class Environment {

    @Value("${baseUrl}")
    private String baseUrl;
}

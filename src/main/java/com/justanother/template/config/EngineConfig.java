package com.justanother.template.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:engine.yml")
public class EngineConfig {

    @Value("${just-another-property}")
    boolean justAnotherProperty;
}

package com.justanother.template;

import com.justanother.template.engine.Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@EnableConfigurationProperties
public class JustAnotherApplication {

    private static final Logger log = LoggerFactory.getLogger(JustAnotherApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(JustAnotherApplication.class, args);
        Engine engine = applicationContext.getBean(Engine.class);
        engine.startEngine();
    }
}

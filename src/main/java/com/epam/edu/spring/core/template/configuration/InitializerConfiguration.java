package com.epam.edu.spring.core.template.configuration;

import com.epam.edu.spring.core.template.factory.ColorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class InitializerConfiguration {

    @Lazy
    @Bean
    public ColorFactory colorFactory() {
        return new ColorFactory();
    }
}

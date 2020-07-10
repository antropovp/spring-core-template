package com.epam.edu.spring.core.template.configuration;

import com.epam.edu.spring.core.template.factory.ColorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializerConfiguration {

    @Bean
    public ColorFactory colorFactory() {
        return new ColorFactory();
    }
}

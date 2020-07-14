package com.epam.edu.spring.core.template.configuration;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.epam.edu.spring.core.template")
@PropertySource("classpath:application.properties")
@Import({InitializerConfiguration.class, RepositoryConfiguration.class})
public class MainConfiguration {
}

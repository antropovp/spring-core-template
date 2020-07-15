package com.epam.edu.spring.core.template.configuration;

import com.epam.edu.spring.core.template.repository.ItemRepository;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.epam.edu.spring.core.template")
@PropertySource("classpath:application.properties")
@Import({InitializerConfiguration.class, RepositoryConfiguration.class})
public class MainConfiguration implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Bean
    public ItemRepository itemRepositoryAlias(@Value("${item.repository.implementation}") String qualifier) {

        ItemRepository itemRepository;

        try {
            itemRepository = (ItemRepository) applicationContext.getBean(qualifier);
        } catch (NoSuchBeanDefinitionException e) {
            itemRepository = (ItemRepository) applicationContext.getBean("array");
        }

        return itemRepository;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

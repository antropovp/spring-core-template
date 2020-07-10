package com.epam.edu.spring.core.template.factory;

import com.epam.edu.spring.core.template.entity.Color;
import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

public class ColorFactory implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        return getColor();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public Color getColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}

package com.epam.edu.spring.core.template.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public enum Color {
    RED, BLUE, WHITE
}

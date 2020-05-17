package com.ebenezer.todo.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Getter
@Setter
@ToString
@Configuration
@PropertySource(value = {"classpath:config.properties","classpath:config1.properties"})
public class ApplicationProperties {

    @Autowired
    Environment environment;



}

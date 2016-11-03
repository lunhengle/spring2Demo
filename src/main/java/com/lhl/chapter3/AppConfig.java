package com.lhl.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lunhengle on 2016/8/30.
 * java_config
 */
@Configuration
public class AppConfig {
    @Bean(name = "animal")
    public IAnimal getAnimal() {
        return new Cat();
    }
}

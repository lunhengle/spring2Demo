package com.lhl.chapter4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lunhengle on 2016/8/30.
 */
@Configuration
public class CustomerConfig {
    @Bean(name = "customer")
    public ICustomer getCustomer() {
        return new Customer();
    }
}

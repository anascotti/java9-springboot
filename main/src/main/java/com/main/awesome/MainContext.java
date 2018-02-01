package com.main.awesome;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.core.awesome")
@EnableJpaRepositories("com.core.awesome")
@EntityScan("com.core.awesome")
public class MainContext {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

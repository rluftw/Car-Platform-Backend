package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 *
 * The Pricing Service API is converted to a microservice with Spring Data REST,
 * without the need to explicitly include code for the Controller or Service.
 */
@SpringBootApplication
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRepositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new ClassPathResource[] { new ClassPathResource("prices.json") });
        return factory;
    }
}

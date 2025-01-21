package com.geisonbruno.demo.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order Management System - API Documentation")
                        .version("1.0.0")
                        .description("Documentação da API para o sistema de gestão de pedidos.")
                        .contact(new Contact()
                                .name("Geison Bruno F. Santos")
                                .email("geisonbruno0@gmail.com")
                                .url("https://github.com/geisonbruno")
                        )
                );
    }
}

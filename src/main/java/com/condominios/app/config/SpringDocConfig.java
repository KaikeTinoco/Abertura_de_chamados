package com.condominios.app.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API - Abertura de Chamados")
                        .version("v1")
                        .description("API de criação de chamados de manutenção para condomínio")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Link Teste")
                        .url("https://teste.com"))
                .tags(
                        Arrays.asList(
                                new Tag().name("Chamados").description("Requisições"),
                                new Tag().name("Manutencao").description("Requisições")
                        )
                );
    }
}

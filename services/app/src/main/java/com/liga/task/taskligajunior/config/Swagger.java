package com.liga.task.taskligajunior.config;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Swagger {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Simple CRUD Application Api")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("tkozhiev@gmail.com")
                                                .url("https://github.com/ChikiPiki-coder?tab=repositories")
                                                .name("Kozhiev Taimyraz")
                                )
                );
    }


}

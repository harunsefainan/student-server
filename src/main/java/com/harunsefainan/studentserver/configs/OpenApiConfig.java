package com.harunsefainan.studentserver.configs;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Info;

public class OpenApiConfig {
    @Bean
    public OpenAPI configureOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Student-Server")
                        .description("This API is developed for storing, managing and presenting student records.")
                        .version("1.0"));
    }
}

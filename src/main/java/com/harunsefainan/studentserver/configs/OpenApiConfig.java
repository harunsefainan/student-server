package com.harunsefainan.studentserver.configs;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        name = "Bearer Authentication",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "Bearer"
)
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

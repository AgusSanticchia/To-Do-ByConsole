package com.todo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.micrometer.common.lang.NonNull;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") @NonNull CorsRegistry registry) {
        registry.addMapping("/**")  // Permitir CORS en todas las rutas
                .allowedOrigins("http://localhost:3000")  // Aquí debes poner el URL de tu React (en desarrollo es normalmente localhost:3000)
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true);  // Permitir credenciales si es necesario
    }
}

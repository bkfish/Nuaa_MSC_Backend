package com.nuaa.msc.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://cydd.online","http://admin.nuaamsc.com","http://localhost:4200","http://192.168.1.114:4200","http://192.168.1.140:4200","http://vue.muyun.work","http://localhost:8080","http://msc.creedowl.com;4200","http://localhost","https://localhost")
                .allowedMethods("*")
                .allowedHeaders("*")
                .maxAge(63000)
                .allowCredentials(true);
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
package com.example.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // 컨테이너에 올리지 않은 상태의 cors
//                .allowedOrigins("http://localhost:5173")
                // 8001 컨테이너에 올린 상태의 cors
//                .allowedOrigins("http://localhost:8011")
                // k8s 워커노드에 30000번 리액트 서버에서 오는 요청
//                .allowedOrigins("https://localhost:30000")
                .allowedOrigins()
                .allowedMethods("GET", "POST", "PUT", "DELETE");

    }
}

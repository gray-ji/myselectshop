package com.sparta.myselectshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // 메인 클래스에 적용하면 Controller 테스트 방해
public class JpaConfig {
}
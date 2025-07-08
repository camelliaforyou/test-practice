package com.endrmfek.testpractice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TestpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestpracticeApplication.class, args);
    }

}

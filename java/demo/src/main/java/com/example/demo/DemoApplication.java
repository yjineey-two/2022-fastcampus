package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello demo");
        System.out.println("demo 브랜치 추가");
        SpringApplication.run(DemoApplication.class, args);
    }
}

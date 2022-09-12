package com.example.todoserver;

import com.example.todoserver.repository.TodoRepository;
import org.springframework.boot.SpringApplication;

public class TodoServerApplication {
    public static void main(String[] args) {
        System.out.println("TODO 브랜치 사용");
        SpringApplication.run(TodoServerApplication.class, args);
    }
}

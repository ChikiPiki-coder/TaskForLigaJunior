package com.liga.task.taskligajunior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TaskLigaJuniorApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskLigaJuniorApplication.class, args);
    }
}

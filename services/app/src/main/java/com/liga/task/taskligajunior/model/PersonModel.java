package com.liga.task.taskligajunior.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PersonModel {
    private String name;
    private String lastName;
    private String email;
}

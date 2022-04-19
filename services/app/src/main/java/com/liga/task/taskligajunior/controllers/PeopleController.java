package com.liga.task.taskligajunior.controllers;

import com.liga.task.taskligajunior.dao.PersonDao;
import com.liga.task.taskligajunior.entity.Person;
import com.liga.task.taskligajunior.model.PersonModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "PeopleController", description = "CRUD controller")
@RestController
@RequestMapping("/people")
@Data
public class PeopleController {
    private final PersonDao personDao;

    @Operation(summary = "Вывод всех Person из базы данных")
    @GetMapping("/")
    public ResponseEntity<List<Person>> index() {
        return new ResponseEntity<>(personDao.findAll(), HttpStatus.OK);
    }

    @Operation(summary = "Вывод конкретного Person из базы данных по идентификатору")
    @GetMapping("/{id}")
    public ResponseEntity<Person> show(@PathVariable("id") int id) {
        return new ResponseEntity<>(personDao.findById(id), HttpStatus.OK);
    }

    @Operation(summary = "Создание и сохранение Person в базу данных")
    @PostMapping()
    public ResponseEntity<String> create(@RequestBody PersonModel person) {
        return new ResponseEntity<>(personDao.save(person), HttpStatus.CREATED);
    }

    @Operation(summary = "Изменение Person по идентификатору")
    @PatchMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody PersonModel person) {
        return new ResponseEntity<>(personDao.update(id, person), HttpStatus.OK);
    }

    @Operation(summary = "Удаление Person из базы данных по идентификатору")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        return new ResponseEntity<>(personDao.delete(id), HttpStatus.ACCEPTED);
    }
}

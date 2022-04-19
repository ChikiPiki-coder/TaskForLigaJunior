package com.liga.task.taskligajunior.repository;

import com.liga.task.taskligajunior.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Override
    List<Person> findAll();
    Person findById(int id);
}

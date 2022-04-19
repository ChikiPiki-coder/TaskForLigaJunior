package com.liga.task.taskligajunior.dao;

import com.liga.task.taskligajunior.entity.Person;
import com.liga.task.taskligajunior.model.PersonModel;
import com.liga.task.taskligajunior.repository.PersonRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class PersonDao {
    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(int id) {
        return personRepository.findById(id);
    }

    public String save(PersonModel person) {
        Person personEntity = new Person();

        personEntity.setName(person.getName());
        personEntity.setLastName(person.getLastName());
        personEntity.setEmail(person.getEmail());
        personRepository.save(personEntity);

        return "Person was created";
    }

    public String update(int id, PersonModel person) {
        Person personEntity = personRepository.findById(id);

        personEntity.setName(person.getName());
        personEntity.setLastName(person.getLastName());
        personEntity.setEmail(person.getEmail());
        personRepository.save(personEntity);

        return "Person  was successfully updated";
    }

    public String delete(int id) {
        personRepository.deleteById(id);
        return "Person was successfully deleted";
    }
}

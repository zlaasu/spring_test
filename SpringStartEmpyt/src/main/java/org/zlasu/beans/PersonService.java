package org.zlasu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<String> getAllPersons() {
//        PersonRepository personRepository = new PersonRepository();
//        return personRepository.findAll();
        return personRepository.findAll();
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }
}

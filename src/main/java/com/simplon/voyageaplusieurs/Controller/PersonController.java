package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.Model.Person;
import com.simplon.voyageaplusieurs.Service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
    private PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person personToCreate) {
        System.out.println(personToCreate);
        Person savedPerson = personService.createPerson(personToCreate);
        return ResponseEntity.ok(savedPerson);
    }
}

package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Person;
import com.simplon.voyageaplusieurs.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;


    //constructor
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;

    }
    @Override
    public Person createPerson(Person personToCreate) {

            return personRepository.save(personToCreate);
    }

    @Override
    public Person findPersonFromPaymentId(Long paymentId) {
        Person person = new Person(); //TODO to remove and replace by implementing the query & function
        return person;
    }

}

package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Payment;
import com.simplon.voyageaplusieurs.Model.Person;
import com.simplon.voyageaplusieurs.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


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
    public Set<Payment> getPersonPayments(Long personId){
        Optional<Person> person = personRepository.findById(personId);

    }

}

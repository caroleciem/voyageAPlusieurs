package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Payment;
import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PersonService {
    /**
     * Person creation method.
     * @param personToCreate the review to create
     * @return the createdPerson
     */
    Person createPerson(Person personToCreate);



}

package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    /**
     * Person creation method.
     * @param personToCreate the review to create
     * @return the createdPerson
     */
    Person createPerson(Person personToCreate);
}

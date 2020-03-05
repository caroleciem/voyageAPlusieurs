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

    /**
     * Find a person corresponding to a payment Id
     * @param paymentId
     * @return a Person
     */
    Person findPersonFromPaymentId(Long paymentId);
}

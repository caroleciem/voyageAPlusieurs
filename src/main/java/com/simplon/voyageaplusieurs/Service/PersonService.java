package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Payment;
import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface PersonService {
    /**
     * Person creation method.
     * @param personToCreate the person to create
     * @return the createdPerson
     */
    Person createPerson(Person personToCreate);

    /**
     * Return list of Payers of a group
     * @param groupId
     * @return
     */
    List<Person> getAllPayers(Long groupId);

    /**
     * Find a person corresponding to a payment Id
     * @param paymentId
     * @return a Person

    Person findPersonFromPaymentId(Long paymentId);


    /**
     * Get the list of payments of a person
     * @param personId
     * @return

    Set<Payment> getPersonPayments(Long personId);
    */


}

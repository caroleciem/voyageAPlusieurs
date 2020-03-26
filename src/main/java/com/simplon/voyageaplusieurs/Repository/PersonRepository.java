package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p where p.id = :paymentId") //TODO query to update with payment table & payment Id
    Person findPersonFromPaymentId(Long paymentId);

    @Query("Select p FROM Person p where p.groupList = :groupId") //TODO to update query to get payers role
    List<Person> getAllPayers(Long groupId);
}

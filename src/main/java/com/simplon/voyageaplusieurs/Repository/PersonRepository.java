package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p JOIN p.payments PAYMENTS where PAYMENTS.id = :paymentId")
    Person findPersonFromPaymentId(Long paymentId);

    @Query("Select p FROM Person p JOIN  p.groupList GROUPS JOIN p.roleSet ROLES where GROUPS.id = :groupId and ROLES.roleType = 'PAYEUR' ")
    List<Person> getAllPayers(Long groupId);
}

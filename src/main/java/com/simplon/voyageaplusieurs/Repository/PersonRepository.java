package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

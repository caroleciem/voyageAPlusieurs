package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

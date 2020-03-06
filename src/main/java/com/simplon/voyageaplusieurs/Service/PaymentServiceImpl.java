package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Payment;
import com.simplon.voyageaplusieurs.Repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    //constructor
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getPayments(){
        return paymentRepository.findAll();
    }
}

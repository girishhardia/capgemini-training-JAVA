package com.CS1PaymentProcessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("creditCardPayment")
@Primary
@Lazy
public class CreditCardPayment implements PaymentService {

    private final TransactionLogger logger;

    @Autowired
    public CreditCardPayment(TransactionLogger logger){
        this.logger = logger;
        System.out.println("CreditCardPayment Bean Created (Lazy)");
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing Credit Card Payment: ₹" + amount);
        logger.log("Credit Card Transaction for ₹" + amount);
    }
}

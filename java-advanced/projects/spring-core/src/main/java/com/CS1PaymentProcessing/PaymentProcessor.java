package com.CS1PaymentProcessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    private final PaymentService paymentService;

    @Autowired
    private TransactionLogger transactionLogger;

    @Autowired
    public PaymentProcessor(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("PaymentProcessor Constructor: UPI Payment Injected via @Qualifier");
    }

    public void makePayment(double amount) {
        System.out.println("PaymentProcessor: Starting payment processing...");
        paymentService.processPayment(amount);
        transactionLogger.log("Payment completed via PaymentProcessor");
    }
}

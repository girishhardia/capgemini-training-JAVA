package com.CS1PaymentProcessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("upiPayment")
@Scope("prototype")
public class UpiPayment implements PaymentService {

    private final TransactionLogger logger;

    @Autowired
    public UpiPayment(TransactionLogger logger) {
        this.logger = logger;
        System.out.println("UpiPayment Bean Created (Prototype)");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment: ₹" + amount);
        logger.log("UPI Transaction for ₹" + amount);
    }
}

package com.CS1PaymentProcessing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Booting Spring Context ---");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("--- Context Booted ---\n");

        System.out.println("1. Demonstrating Prototype Scope (UpiPayment)");
        PaymentService upi1 = context.getBean("upiPayment", PaymentService.class);
        PaymentService upi2 = context.getBean("upiPayment", PaymentService.class);
        System.out.println("UPI Instance 1: " + upi1);
        System.out.println("UPI Instance 2: " + upi2);
        System.out.println("Are they same? " + (upi1 == upi2) + "\n");

        System.out.println("2. Demonstrating @Primary (Default Injection)");
        PaymentService primaryService = context.getBean(PaymentService.class);
        System.out.println("Primary service bean: " + primaryService.getClass().getSimpleName());
        primaryService.processPayment(300.0);
        System.out.println();

        System.out.println("3. Demonstrating Lazy Initialization (CreditCardPayment)");
        System.out.println("Requesting CreditCardPayment bean explicitly now...");
        PaymentService cc = context.getBean("creditCardPayment", PaymentService.class);
        cc.processPayment(500.0);
        System.out.println();

        System.out.println("4. Demonstrating @Qualifier and mixed DI (PaymentProcessor)");
        PaymentProcessor processor = context.getBean(PaymentProcessor.class);
        processor.makePayment(1200.0);
        System.out.println();

        System.out.println("--- Closing Spring Context ---");
        context.close();
    }
}

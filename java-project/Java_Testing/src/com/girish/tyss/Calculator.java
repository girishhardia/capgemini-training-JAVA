package com.girish.tyss;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public String getMessage() {
        return "JUnit Testing";
    }

    public int[] getNumbers() {
        return new int[]{1, 2, 3};
    }
}

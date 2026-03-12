package com.girish.testing;

import java.time.Duration;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.girish.tyss.Calculator;

public class CalculatorTesting {

    static Calculator calc;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before ALL tests");
        calc = new Calculator();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before EACH test");
    }

    @Test
    void testAssertEqualsAndNotEquals() {
        Assertions.assertEquals(5, calc.add(2, 3));
        Assertions.assertNotEquals(10, calc.add(2, 3));
    }

    @Test
    void testAssertTrueAndFalse() {
        Assertions.assertTrue(calc.multiply(2, 3) == 6);
        Assertions.assertFalse(calc.multiply(2, 3) == 10);
    }

    @Test
    void testAssertNullAndNotNull() {
        String value = null;
        Assertions.assertNull(value);
        Assertions.assertNotNull(calc.getMessage());
    }

    @Test
    void testAssertSameAndNotSame() {
        Calculator c1 = calc;
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        Assertions.assertSame(c1, c2);
        Assertions.assertNotSame(c1, c3);
    }

    @Test
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        Assertions.assertArrayEquals(expected, calc.getNumbers());
    }

    @Test
    void testAssertThrowsAndDoesNotThrow() {
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calc.divide(10, 0)
        );

        Assertions.assertDoesNotThrow(
                () -> calc.divide(10, 2)
        );
    }

    @Test
    void testAssertAll() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(5, calc.add(2, 3)),
                () -> Assertions.assertEquals(1, calc.subtract(3, 2)),
                () -> Assertions.assertEquals(6, calc.multiply(2, 3))
        );
    }
    
    @Test
    void testDivideByZero() {
        Assertions.assertThrows(
            ArithmeticException.class,
            () -> calc.divide(10, 0)
        );
    }


    @Test
    void testAssertTimeout() {
        Assertions.assertTimeout(
                Duration.ofMillis(100),
                () -> calc.add(100, 200)
        );
    }

    @AfterEach
    void afterEach() {
        System.out.println("After EACH test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After ALL tests");
    }

    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "5, 5, 10",
        "10, 20, 30",
        "0, 5, 5"
    })
    void testAdd(int a, int b, int expected) {
        Assertions.assertEquals(expected, calc.add(a, b));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void testAddWithZero(int value) {
        Calculator calc = new Calculator();
        Assertions.assertEquals(value, calc.add(value, 0));
    }
    
    @ParameterizedTest
    @MethodSource("addTestData")
    void testAddUsingMethodSource(int a, int b, int expected) {
        Assertions.assertEquals(expected, calc.add(a, b));
    }
    
    static Stream<Arguments> addTestData() {
        return Stream.of(
            Arguments.of(2, 3, 5),
            Arguments.of(5, 5, 10),
            Arguments.of(10, 20, 30),
            Arguments.of(0, 5, 5),
            Arguments.of(-2, 3, 1)
        );
    }
    @ParameterizedTest
    @CsvFileSource(
        files = "test-data/add.csv",
        numLinesToSkip = 1
    )
    void testAddUsingCsvFileSource(int a, int b, int expected) {
        Assertions.assertEquals(expected, calc.add(a, b));
    }

}

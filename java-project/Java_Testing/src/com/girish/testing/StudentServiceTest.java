package com.girish.testing;

import com.girish.tyss.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class StudentServiceTest {

    StudentService service = new StudentService();

    @Test
    void testAssertTrue() {
        Assertions.assertTrue(service.isEligible(18));
    }

    @Test
    void testAssertFalse() {
        Assertions.assertFalse(service.isEligible(17));
    }

    @Test
    void testAssertEquals() {
        Assertions.assertEquals(true, service.isEligible(20));
    }

    @Test
    void testAssertNotEquals() {
        Assertions.assertNotEquals(true, service.isEligible(16));
    }

    @Test
    void testAssertNotNull() {
        Assertions.assertNotNull(service);
    }

    @Test
    void testAssertSame() {
        StudentService s1 = service;
        StudentService s2 = s1;
        Assertions.assertSame(s1, s2);
    }

    @Test
    void testAssertNotSame() {
        StudentService s1 = new StudentService();
        StudentService s2 = new StudentService();
        Assertions.assertNotSame(s1, s2);
    }

    @Test
    void testAssertAll() {
        Assertions.assertAll(
            () -> Assertions.assertTrue(service.isEligible(25)),
            () -> Assertions.assertFalse(service.isEligible(10)),
            () -> Assertions.assertEquals(true, service.isEligible(30))
        );
    }

    @Test
    void testAssertThrows() {
        Assertions.assertThrows(
            IllegalArgumentException.class,
            () -> service.isEligible(-1)
        );
    }

    @Test
    void testFail() {
        if (service.isEligible(18) != true) {
            Assertions.fail("Eligibility logic failed");
        }
    }
}

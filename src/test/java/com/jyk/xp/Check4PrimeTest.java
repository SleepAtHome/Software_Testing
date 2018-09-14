package com.jyk.xp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Check4PrimeTest extends TestCase {
    private Check4Prime check4Prime = new Check4Prime();

    public Check4PrimeTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println("Starting test...");
        junit.textui.TestRunner.run(suite());
        System.out.println("Test finished....");
    }

    public static Test suite() {
        TestSuite testSuite = new TestSuite(Check4Prime.class);
        return testSuite;
    }

    // Test case 1
    public void testCheckPrime_true() {
        assertTrue(check4Prime.primeCheck(3));
    }

    public void testCheckPrime_false() {
        assertFalse(check4Prime.primeCheck(0));
        assertFalse(check4Prime.primeCheck(1000));
    }
}

package com.example.parcial2;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

    public void testFibonacci() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.Fibonacci(10);
        assertEquals(10, result);
    }
}
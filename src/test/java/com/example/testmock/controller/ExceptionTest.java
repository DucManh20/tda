package com.example.testmock.controller;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    @DisplayName(value = "/ by zero")
    public void divByZero() {
        int a = 0;
        int b = 1 / a;
    }

    @Test(expected = NullPointerException.class)
    @DisplayName(value = "arr null")
    public void arrayNull() {
        int[] a = null;
        System.out.println("Size of array:" + a.length);
    }
}
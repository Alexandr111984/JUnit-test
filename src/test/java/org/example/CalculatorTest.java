package org.example;

import org.junit.jupiter.api.*;

import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculator;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void testPlusPositive() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.plus.apply(2, 2));

    }

    @org.junit.jupiter.api.Test
    public void testMinusPositive() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(6, calculator.minus.apply(8, 2));

    }

    @org.junit.jupiter.api.Test
    public void testMultiplyPositive() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(36, calculator.multiply.apply(6, 6));
    }

    @org.junit.jupiter.api.Test
    public void testPlusNegative() {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(5, calculator.plus.apply(2, 2));
    }

    @org.junit.jupiter.api.Test
    public void testMinusNegative() {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(9, calculator.minus.apply(8, 2));
    }

    @org.junit.jupiter.api.Test
    public void testMultiplyNegative() {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(28, calculator.multiply.apply(6, 6));
    }
}


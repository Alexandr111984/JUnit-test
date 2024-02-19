package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculator;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void positiveTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.plus.apply(2, 2));
        Assertions.assertEquals(6, calculator.minus.apply(8, 2));
        Assertions.assertEquals(36, calculator.multiply.apply(6, 6));
    }

    @org.junit.jupiter.api.Test
    public void negativeTest() {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(5, calculator.plus.apply(2, 2));
        Assertions.assertNotEquals(9, calculator.minus.apply(8, 2));
        Assertions.assertNotEquals(28, calculator.multiply.apply(6, 6));
    }

}
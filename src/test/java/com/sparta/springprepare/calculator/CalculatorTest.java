package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("더하기 테스트")
    void 더하기테스트() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(1, "+", 2);
        System.out.println("정답 : " + result);
        Assertions.assertEquals(3.0, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void 나누기테스트() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(1, "/", 2);
        System.out.println("정답 : " + result);
        Assertions.assertEquals(0.5, result);

    }
}
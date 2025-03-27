package org;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.Calculator;
public class CalculatorTest {

    Calculator myCalculator;
    int result;

    @BeforeEach
void setUp(){
     myCalculator = new Calculator();
    }

    @Test
    void addTest(){
        result = myCalculator.add(2,2);
        assertEquals(4, result);
    }

    @Test
    void substract(){
        result = myCalculator.subtract(10, 2);
        assertEquals(8, result);
    }

    @Test
    void multiply(){
        result = myCalculator.multiply(6,4);
        assertEquals(24, result);
    }

    @Test
    void divide(){
        result = myCalculator.divide (21, 3);
        assertEquals(7, result);
    }


}

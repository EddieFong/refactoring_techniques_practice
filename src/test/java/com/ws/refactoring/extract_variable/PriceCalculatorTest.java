package com.ws.refactoring.extract_variable;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void calculate() {
        assertEquals(new PriceCalculator().getPrice(20,30),260.0);
    }
}

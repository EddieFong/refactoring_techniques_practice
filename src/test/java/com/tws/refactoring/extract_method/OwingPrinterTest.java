package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        List<Order> orders = new ArrayList<Order>(Arrays.asList(new Order(123), new Order(456), new Order(789)));
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("Name",orders);
        String expected = "*****************************";
        expected+= "****** Customer totals ******";
        expected+= "*****************************";
        expected+="name: Name";
        expected+="amount: 1368";
        assertEquals(expected, outContent.toString());
    }


}
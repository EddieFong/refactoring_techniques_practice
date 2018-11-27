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

        String expected = "*****************************\r\n";
        expected+= "****** Customer totals ******\r\n";
        expected+= "*****************************\r\n";
        expected+="name: Name\r\n";
        expected+="amount: 1368.0\r\n";

        List<Order> orders = new ArrayList<Order>(Arrays.asList(new Order(123.0), new Order(456.0), new Order(789.0)));
        new OwingPrinter().printOwing("Name",orders);

        assertEquals(expected, outContent.toString());
    }


}
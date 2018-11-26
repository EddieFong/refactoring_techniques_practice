package com.tws.refactoring.extract_method;

import java.util.*;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {

        printBanner();
        double outstanding = getOutstanding(orders);
        printDetails(name, outstanding);

    }

    private void printDetails(String name, double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private double getOutstanding(List<Order> orders) {

        double outstanding = 0.0;
        while (orders.iterator().hasNext()) {
            Order each = (Order) orders.iterator().next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }

}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}



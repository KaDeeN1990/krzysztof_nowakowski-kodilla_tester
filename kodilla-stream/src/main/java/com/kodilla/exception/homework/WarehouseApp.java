package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(Warehouse.addOrder("101"));
        orders.add(Warehouse.addOrder("201"));
        orders.add(Warehouse.addOrder("301"));
        System.out.println(orders);
    }
}

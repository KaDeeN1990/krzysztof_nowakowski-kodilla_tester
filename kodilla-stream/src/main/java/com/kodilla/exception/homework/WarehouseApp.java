package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("101");
        warehouse.addOrder("201");
        warehouse.addOrder("301");

        try {
            Order order = warehouse.getOrder("102");
            System.out.println(order);
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }

    }
}

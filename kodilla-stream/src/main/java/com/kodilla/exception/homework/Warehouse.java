package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(String number){
        Order order = new Order(number);
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o->o.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
    }
}

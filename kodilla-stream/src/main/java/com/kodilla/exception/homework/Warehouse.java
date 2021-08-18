package com.kodilla.exception.homework;


import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    public static Order addOrder(String number){
        Order order = new Order(number);
        return order;
    }
    public void getOrder(String number){
        List<String> ordered = WarehouseApp.getNumber()
                .stream()
                .map(u->u.getNumber())
                .collect(Collectors.toList());
        System.out.println(ordered);
    }
}

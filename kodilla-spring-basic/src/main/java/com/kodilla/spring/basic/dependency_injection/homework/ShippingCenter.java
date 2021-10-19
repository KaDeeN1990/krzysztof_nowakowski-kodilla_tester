package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.stereotype.Component;


public class ShippingCenter {
    private DeliveryServices deliveryService;
    private NotificationServices notificationService;

    public ShippingCenter(DeliveryServices deliveryService, NotificationServices notificationService){
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }
    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(weight)){
            this.notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }

    private boolean checkWeight(double weight){
        return weight < 30 && weight > 0;
    }
}

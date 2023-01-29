package com.learning.functionalapproach.Tienda.eventbus.events;

public class NewOrderEvent {

    private final int orderId;

    public NewOrderEvent(int orderId) {
        this.orderId = orderId;
    }
}

package com.learning.functionalapproach.Tienda.eventbus;

import com.learning.functionalapproach.Tienda.eventbus.events.NewOrderEvent;

import java.util.function.Supplier;

public interface OrderProcessor {
    Supplier<NewOrderEvent> newOrderEvent();
}

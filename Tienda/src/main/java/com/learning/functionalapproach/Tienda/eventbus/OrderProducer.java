package com.learning.functionalapproach.Tienda.eventbus;

import com.learning.functionalapproach.Tienda.eventbus.events.NewOrderEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.util.function.Supplier;

@Log4j2
@Component
@RequiredArgsConstructor
public class OrderProducer implements OrderProcessor {

    int orderNumber = 1;

    private final StreamBridge streamBridge;

    @Override
    public void newOrderEvent() {
        NewOrderEvent newOrderEvent = new NewOrderEvent(orderNumber);
        orderNumber += 1;

        log.info("Sending new order.");
        this.streamBridge.send("newOrderEvent-out-0", newOrderEvent);
    }

}


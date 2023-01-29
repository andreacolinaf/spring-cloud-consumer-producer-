package com.learning.functionalapproach.Tienda.eventbus;

import com.learning.functionalapproach.Tienda.eventbus.events.NewOrderEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
@Log4j2
public class OrderProducer implements OrderProcessor {

    int orderNumber = 1;

    @Bean("newOrderEvent")
    @Override
    public Supplier<NewOrderEvent> newOrderEvent() {
        NewOrderEvent newOrderEvent = new NewOrderEvent(orderNumber);
        orderNumber += 1;

        log.info("Sending new order");
        return () -> newOrderEvent;
    }
}


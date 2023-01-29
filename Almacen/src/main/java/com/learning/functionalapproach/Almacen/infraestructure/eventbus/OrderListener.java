package com.learning.functionalapproach.Almacen.infraestructure.eventbus;


import com.learning.functionalapproach.Almacen.infraestructure.eventbus.model.NewOrderEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Log4j2
@Configuration
public class OrderListener implements OrderConsumer {

    @Bean
    @Override
    public Consumer<NewOrderEvent> newOrderEvent() {
        return newOrderEvent -> {
            log.info("New order received: {}", newOrderEvent::getOrderId);
        };
    }
}

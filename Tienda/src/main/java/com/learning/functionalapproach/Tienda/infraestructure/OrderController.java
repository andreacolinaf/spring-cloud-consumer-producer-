package com.learning.functionalapproach.Tienda.infraestructure;

import com.learning.functionalapproach.Tienda.eventbus.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/order")
    public void newOrder() {
        this.orderProducer.newOrderEvent();
    }

}


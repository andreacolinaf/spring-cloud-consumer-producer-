package com.learning.functionalapproach.Tienda.eventbus.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class NewOrderEvent {

    int orderId;

    public NewOrderEvent(int orderId) {
        this.orderId = orderId;
    }
}

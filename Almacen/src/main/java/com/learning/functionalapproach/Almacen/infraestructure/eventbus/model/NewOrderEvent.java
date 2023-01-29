package com.learning.functionalapproach.Almacen.infraestructure.eventbus.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewOrderEvent {

    private int orderId;

}

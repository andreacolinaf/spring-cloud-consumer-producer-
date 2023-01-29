package com.learning.functionalapproach.Almacen.infraestructure.eventbus;

import com.learning.functionalapproach.Almacen.infraestructure.eventbus.model.NewOrderEvent;
import java.util.function.Consumer;

public interface OrderConsumer {

    Consumer<NewOrderEvent> newOrderEvent();
}

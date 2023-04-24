package com.cjw.desafiomodulo1.services;

import com.cjw.desafiomodulo1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double shipmentValue = 0.00;
        if(order.getBasic() < 100.00) {
            shipmentValue = 20.00;
        }
        else if (order.getBasic() <= 200.00) {
            shipmentValue = 12.00;
        }

        return shipmentValue;
    }

}

package project.model;

import project.entity.Purchase;

public class DeliveryPrice implements AppModel {
    private final double PERCENT = 10;

    @Override
    public double calculateTotalPrice(Purchase purchase) {
        double deliveryCost = (purchase.getQuantity() * purchase.getPrice()) * PERCENT / 100;
        return deliveryCost + (purchase.getQuantity() * purchase.getPrice());
    }
}


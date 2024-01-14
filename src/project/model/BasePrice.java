package project.model;

import project.entity.Purchase;

public class BasePrice implements AppModel{
    public double calculateTotalPrice (Purchase purchase){
        return purchase.getQuantity() * purchase.getPrice();
    }
}

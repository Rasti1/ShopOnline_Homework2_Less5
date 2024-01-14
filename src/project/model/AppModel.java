package project.model;

import project.entity.Purchase;

public interface AppModel {
    double calculateTotalPrice(Purchase purchase);
}

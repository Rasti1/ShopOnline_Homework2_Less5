package project.controller;

import project.entity.Purchase;
import project.model.BasePrice;
import project.model.DeliveryPrice;
import project.utils.Rounder;
import project.view.AppView;

public class AppController {

    private final AppView view = new AppView();
    private final static String CURRENCY = "USD";

    public void getInfo() {

        String[] data = view.getData();
        int counter = Integer.parseInt(data[0]);

        if (counter == 1) {
            int quantity = Integer.parseInt(data[1]);
            double price = Double.parseDouble(data[2]);
            Purchase purchase = new Purchase(quantity, price);
            BasePrice baseCalculator = new BasePrice();
            double total = baseCalculator.calculateTotalPrice(purchase);
            String roundedTotal = Rounder.roundValue(total);
            view.getOutput("Total price: " + roundedTotal + " " + CURRENCY
                           + "\nCome and pick up your order. We are waiting!");
        } else if (counter == 2){
            int quantity = Integer.parseInt(data[1]);
            double price = Double.parseDouble(data[2]);
            Purchase purchase = new Purchase(quantity, price);
            DeliveryPrice deliveryCalculator = new DeliveryPrice();
            double finalCost = deliveryCalculator.calculateTotalPrice(purchase);
            String roundedTotal = Rounder.roundValue(finalCost);
            System.out.println("The delivery amount is equal to 10 percent of each purchase.");
            view.getOutput("Total price: " + roundedTotal + " " + CURRENCY
                           + "\nCourier is on the way. Wait.");
        } else {
            System.out.println("Incorrect option. Try again.");
        }
    }
}

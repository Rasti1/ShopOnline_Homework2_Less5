package project.entity;

public class Purchase {
    private static int quantity;
    private static double price;

    public Purchase(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
}

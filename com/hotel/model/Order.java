package com.hotel.model;
public class Order {
    

    private int orderId;
    private Customer customer;
    private FoodItem foodItem;
    private int quantity;

    public Order(int orderId,Customer customer,FoodItem foodItem,int quantity){
        this.orderId=orderId;
        this.customer=customer;
        this.foodItem=foodItem;
        this.quantity=quantity;
    }
    public int getOrderId(){
        return orderId;

    }
    public Customer getCustomer(){
        return customer;
    }
    public FoodItem getFoodItem(){
        return foodItem;
    }
    public int getQuantity(){

        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;
        }
    }
    public double calculateTotal(){
        return foodItem.getPrice()*quantity;
    }
    
     

    public void displayOrder() {
        System.out.println("Order ID    : " + orderId);
        System.out.println("Customer    : " + customer.getName());
        System.out.println("Food        : " + foodItem.getFoodName());
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total       : " + calculateTotal());
    }


    
}

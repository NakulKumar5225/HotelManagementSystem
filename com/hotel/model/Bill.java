package com.hotel.model;

public class Bill {
    private int billId;
    private Order order;
    private double tax;
    
    public Bill(int billId,Order order,double tax){
        this.billId=billId;
        this.order=order;
        this.tax=tax;
    }
    public int getBillId(){
        return billId;


    }
    public Order getOrder(){
        return order;
    }
    public double getTax(){
        return tax;
    } 
    public double calculateFinalAmount(){
        double total=order.calculateTotal();
        double taxAmount=total*tax/100;

        return total+taxAmount;
    }
     public void displayBill() {
        System.out.println("Bill ID       : " + billId);
        System.out.println("Order Total   : " + order.calculateTotal());
        System.out.println("Tax           : " + tax + "%");
        System.out.println("Final Amount  : " + calculateFinalAmount());
    }
}

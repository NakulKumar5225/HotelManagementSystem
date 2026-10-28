package com.hotel.service;

import com.hotel.model.Order;
import java.util.ArrayList;

public class OrderService {
    private ArrayList<Order>orderList=new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
           
        System.out.println("Order Added Sucsesfully");
        
            
        
    }
    public void showAllOrder(){
        if(orderList.isEmpty()){
        System.out.println("No orders founds");
        return;
        }
        for (Order order : orderList) {
            order.displayOrder();
            System.out.println("---------------");
            
        }
    }
         public Order findOrderById(int orderId) {

            for(Order order :orderList){
                if(order.getOrderId()==orderId){
                    return order;
                }
            }
            return null;
        
    }
}

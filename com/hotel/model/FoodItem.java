package com.hotel.model;
public class FoodItem{

    private int foodId;
    private String foodName;
    private String category;
    private double price;
    private boolean available;

    public FoodItem(int foodId,String foodName,String category,double price ,boolean available){
        this.foodId=foodId;
        this.foodName=foodName;
        this.category=category;
        this.price=price;
        this.available=available;

    }

    public int getFoodId(){
        return foodId;
    }
    public String getFoodName(){
        return foodName;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public boolean getAvailable(){
        return available;
    }
    public void setPrice(double price ){
        if(price >=0){
            this.price=price;
        }
    }
    public void setAvailable(){

        this.available=available;
    }
    

    public void displayFoodItem(){
        System.out.println("Food Id : "+foodId);
        System.out.println("Food Name :"+ foodName );
        System.out.println("Category :"+category);
        System.out.println("Price :"+price);
        System.out.println("Available :  "+available);
    }



}
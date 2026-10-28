package com.hotel.model;
public class Room {
    private int roomId;
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean available;


    public Room(int roomId, int roomNumber, String roomType,
                double pricePerNight, boolean available){
        this.roomId=roomId;
        this.roomNumber=roomNumber;
        this.roomType=roomType;
        this.pricePerNight=pricePerNight;
        this.available=available;


    }
    public int getRoomId(){
        return roomId;


    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getRoomType(){
        return roomType;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }
    public boolean  getisAvailable(){
        return available;
    }

    public void setPricePerNight(double pricePerNight){
        if(pricePerNight >=0){
            this.pricePerNight=pricePerNight;
        }
    }
    public void setAvailable(boolean available){

        this.available=available;
        
    }

    public  void displayRoom(){
        System.out.println("RoomId  :" +roomId);
        System.out.println("RoomNumber  :"+roomNumber);
        System.out.println("RoomType :"+roomType);
        System.out.println("PricePerNight  :"+pricePerNight);
        System.out.println("Available  :"+available);

        System.out.println();

    }


}

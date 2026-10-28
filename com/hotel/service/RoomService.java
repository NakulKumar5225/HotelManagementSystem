
package com.hotel.service;
import com.hotel.model.Room;
import java.util.ArrayList;

public class RoomService {
    private ArrayList<Room>roomList = new ArrayList<>();

    public void addRoom(Room room){

        for(Room existingRoom :roomList){
            if(existingRoom.getRoomNumber()==room.getRoomNumber()){
                System.out.println("Room Number Already Exists!");
                return ;
            }
            
        }

        roomList.add(room);

        System.out.println("Room Added Successfully");
    
    }
    public void showAllRoom(){
        if(roomList.isEmpty()){

            System.out.println("Noo Room Found");

            return;
        }
        for(Room room:roomList){
            room.displayRoom();
                System.out.println("------------------");

        }
    }

    public Room findRoomById(int roomId){
        for(Room room : roomList){
            if(room.getRoomId() == roomId){
                return room;
            }
        }
        return null;

    }

}

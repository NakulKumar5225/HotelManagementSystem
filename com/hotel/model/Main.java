 package com.hotel.model;

import com.hotel.service.BillingService;
import com.hotel.service.CustomerService;
import com.hotel.service.OrderService;
import com.hotel.service.RestaurantService;
import com.hotel.service.RoomService;
import com.hotel.service.StaffService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff(
                101,
                "Nakul",
                "9876543210",
                "nakul@gmail.com",
                "Reception",
                25000);

        staff.displayStaff();

        FoodItem foodItem = new FoodItem(
                102,
                "Kadai Paneer",
                "Starter",
                290,
                false);

        foodItem.displayFoodItem();

        Customer customer = new Customer(103,
                "Raavi", "8533881952",
                "ravikumar@mail.com");

        // customer.displayCustomer();
        // Customer c = new Customer(
        //         1, "Nakul", "9876543210", "nakul@gmail.com");

        // FoodItem f = new FoodItem(
        //         101, "Paneer Tikka", "Starter", 250, true);

        // Order order = new Order(1, c, f, 2);

        // order.displayOrder();

        // Bill bill = new Bill(105, order, 5);

        // bill.displayBill();

        Room room = new Room(
                1,
                101,
                "Deluxe",
                3000,
                true);
        room.displayRoom();

        StaffService newstaffservice = new StaffService();

        Staff newstaff1 = new Staff(101,
                "Nakul",
                "9876543210",
                "nakul@gmail.com",
                "Reception",
                25000);

        Staff newstaff2 = new Staff(
                102,
                "Rahul",
                "9876543211",
                "rahul@gmail.com",
                "Kitchen",
                30000);

        newstaffservice.addStaff(newstaff1);
        newstaffservice.addStaff(newstaff2);
        newstaffservice.showAllStaff();

        RestaurantService restaurantService = new RestaurantService();

        // FoodItem food1 = new FoodItem(101, "Paneer Tikka", "Starter", 250, true);
        // FoodItem food2 = new FoodItem(2, "Dal Makhni", "Starter", 190, true);

        restaurantService.addFood(foodItem);
        // restaurantService.addFood(food2);

        restaurantService.showAllFood();

         OrderService orderService = new OrderService();
        // Order order1 = new Order(1,
        // customer,
        // food2,
        // 2);
        // Order order2 = new Order(2, customer, food1, 2);

        // orderService.addOrder(order);

        // orderService.showAllOrder();

        BillingService billingservice = new BillingService();

        // billingservice.addBill(bill);

        billingservice.showAllBill();

        RoomService roomService = new RoomService();

        roomService.addRoom(room);

        roomService.showAllRoom();

        CustomerService customerService = new CustomerService();
        // customerService.addCustomer(customer);
        customerService.showAllCustomers();

        // USER INPUT

        Scanner sc = new Scanner(System.in);
        StaffService newstaffService = new StaffService();
        RestaurantService newrestaurantservice = new RestaurantService();
        CustomerService newcustomerservice=new CustomerService();
       OrderService neworderService = new OrderService();
       BillingService billingService = new BillingService();
        RoomService newroomservice = new RoomService();
  

        while (true) {

            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Staff Management");
            System.out.println("2. Restaurant Management");
            System.out.println("3. Customer Management");
            System.out.println("4. Order Management");
            System.out.println("5. Billing");
            System.out.println("6. Room Management");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // case 1:
                // System.out.println("Staff Management selected.");
                // break;
                case 1:
                    while (true) {

                        System.out.println("\n===== STAFF MANAGEMENT =====");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Show All Staff");
                        System.out.println("3. Find Staff");
                        System.out.println("4. Back");

                        System.out.print("Enter your choice: ");
                        int staffChoice = sc.nextInt();

                        switch (staffChoice) {

                            case 1:
                                System.out.print("Enter Staff ID: ");
                                int staffId = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter Name: ");
                                String name = sc.nextLine();

                                System.out.print("Enter Phone: ");
                                String phone = sc.nextLine();

                                System.out.print("Enter Email: ");
                                String email = sc.nextLine();

                                System.out.print("Enter Department: ");
                                String department = sc.nextLine();

                                System.out.print("Enter Salary: ");
                                double salary = sc.nextDouble();

                                Staff newstaff = new Staff(
                                        staffId,
                                        name,
                                        phone,
                                        email,
                                        department,
                                        salary);

                                newstaffService.addStaff(newstaff);
                                break;

                            case 2:
                                newstaffService.showAllStaff();
                                break;

                            case 3:
                                System.out.print("Enter Staff ID to find: ");
                                int searchId = sc.nextInt();

                                Staff foundStaff = newstaffService.findStaffById(searchId);

                                if (foundStaff != null) {
                                    foundStaff.displayStaff();
                                } else {
                                    System.out.println("Staff not found.");
                                }
                                break;

                            case 4:
                                System.out.println("Going back...");
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }

                        if (staffChoice == 4) {
                            break;
                        }
                    }
                    break;

                case 2:
                    while(true){
                        System.out.println("\n===== RESTAURANT MANAGEMENT =====");
                        System.out.println("1. Add Food");
                        System.out.println("2. Show All Food");
                        System.out.println("3. Find Food");
                        System.out.println("4. Back");

                        System.out.print("Enter your choice: ");
                        int foodChoice = sc.nextInt();
                     switch(foodChoice){
                         case 1:
                        System.out.println("Enter FoodId:");
                        int foodId=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter FoodName:");
                        String foodName=sc.nextLine();
                        System.out.println("Enter Category:");
                        String category=sc.nextLine();
                        System.out.println("Enter Price");
                        double price=sc.nextDouble();
                        System.out.println("Availble");
                        boolean available=sc.nextBoolean();

                        FoodItem newfood = new FoodItem(
                                           foodId,
                                           foodName,
                                           category,
                                           price,
                                           available
                                                      );
                               newrestaurantservice.addFood( newfood); 
                               
                               break;
                         case 2:
                               newrestaurantservice.showAllFood();
                                break;
                         case 3: 
                                System.out.println("Enter Food Id TO Find ");
                                 int searchId=sc.nextInt();

                                 FoodItem foundFood = newrestaurantservice.findFoodById(searchId);

                                 if(foundFood !=null){

                                    foundFood.displayFoodItem();
                                 }else{
                                    System.out.println("Food Not Found");
                                    break;
                                 }
                         case 4: 
                                System.out.println("Going Back"); 
                                break;
                              default:
                                System.out.println("Invlid Choice ");  
                         }
                         if(foodChoice==4){
                            break;
                         }

                    }
                    break;

                    // System.out.println("Restaurant Management selected.");
                    // break;

                case 3:
                    while(true){
                          System.out.println("\n=====   CUSTOMER MANAGEMENT =====");
                          System.out.println("1.Add Customer");
                          System.out.println("2.Show All Customer");
                          System.out.println("3.Find Customer");
                          System.out.println("4.Back");

                          System.out.println("Enter Your Choice");

                          int customerChoice=sc.nextInt();
                    
                       switch (customerChoice) {
                           case 1:
                               System.out.println("Enter Customer Id ");
                               int customerId=sc.nextInt();
                               sc.nextLine();
                               System.out.println("Enter Name");
                               String name = sc.nextLine();
                               System.out.println("Enter Phone");
                               String phone=sc.nextLine();
                               System.out.println("Enter Email");
                               String email=sc.nextLine();

                             Customer newcustomer=new Customer(customerId, name, phone, email);
                            newcustomerservice.addCustomer(newcustomer);


                             

                            //  System.out.println("Customer Addded successfully.");
                          break;
                        case 2:
                            newcustomerservice.showAllCustomers();
                            break;
                        case 3:
                            System.out.println("Enter Cstomer Id To find ");
                            int searchCustomerId=sc.nextInt();

                            Customer foundCustomer=newcustomerservice.findByCustomerId(searchCustomerId);
                            if(foundCustomer!=null){
                                foundCustomer.displayCustomer();

                            }else{
                              System.out.println("Customer Not found") ;
                            

                            }   

                            break;
                            

                         case 4:
                            System.out.println("Going Back"); 

                            break;
                            
                            default:
                                System.out.println("Invalid Choice");
                                
                       } 
                       if(customerChoice==4){
                        break;
                       }

                    }
           
                     break;

                
                case 4:

    while (true) {

        System.out.println("\n===== ORDER MANAGEMENT =====");
        System.out.println("1.Add Order");
        System.out.println("2.Show All Order");
        System.out.println("3.Find Order");
        System.out.println("4.Back");

        System.out.println("Enter Your Choice");
        int orderChoice = sc.nextInt();

        switch (orderChoice) {

            case 1:

                System.out.println("Enter Order Id");
                int orderId = sc.nextInt();

                System.out.println("Enter Customer Id");
                int customerId = sc.nextInt();

                Customer newcustomer =
                    newcustomerservice.findByCustomerId(customerId);

                if (newcustomer == null) {
                    System.out.println("Customer Not Found");
                    break;
                }

                newcustomer.displayCustomer();

                System.out.println("Enter Food Id");
                int foodId = sc.nextInt();

                FoodItem food =
                    newrestaurantservice.findFoodById(foodId);

                if (food == null) {
                    System.out.println("Food Not Found");
                    break;
                }
                if(!food.getAvailable()){
                    System.out.println("Sorry, this food is currently unavailable.");
                    break;
                }

                


                System.out.println("Enter Quantity");
                int quantity = sc.nextInt();

                if (quantity <= 0) {
                    System.out.println("Quantity must be greater than 0");
                    break;
                }

                Order neworder = new Order(
                    orderId,
                    newcustomer,
                    food,
                    quantity
                );

                neworderService.addOrder(neworder);

                System.out.println("Order created successfully.");

                break;


            case 2:

                neworderService.showAllOrder();

                break;


            case 3:

                System.out.println("Enter Order Id To find");
                int searchOrderId = sc.nextInt();

                Order foundOrder =
                    neworderService.findOrderById(searchOrderId);

                if (foundOrder != null) {
                    foundOrder.displayOrder();
                } else {
                    System.out.println("Order Not Found");
                }

                break;


            case 4:

                System.out.println("Going Back");
                break;


            default:

                System.out.println("Invalid Choice");
        }

        if (orderChoice == 4) {
            break;
        }
    }

    break;

    case 5:

    while (true) {

        System.out.println("\n===== BILLING MANAGEMENT =====");
        System.out.println("1. Add Bill");
        System.out.println("2. Show All Bills");
        System.out.println("3. Find Bill");
        System.out.println("4. Back");

        System.out.print("Enter Your Choice: ");
        int billChoice = sc.nextInt();

        switch (billChoice) {

            case 1:

                System.out.print("Enter Bill ID: ");
                int billId = sc.nextInt();

                System.out.print("Enter Order ID: ");
                int orderIdForBill = sc.nextInt();

                // SAME orderService
                Order billOrder =
                    neworderService.findOrderById(orderIdForBill);

                if (billOrder == null) {
                    System.out.println("Order Not Found");
                    break;
                }

                // Show selected order
                billOrder.displayOrder();

                System.out.print("Enter Tax (%): ");
                double tax = sc.nextDouble();

                if (tax < 0) {
                    System.out.println("Tax cannot be negative");
                    break;
                }

                Bill newbill =
                    new Bill(billId, billOrder, tax);

                // SAME billingService
                billingService.addBill(newbill);

                System.out.println("Bill created successfully.");

                break;


            case 2:

                billingService.showAllBill();

                break;


            case 3:

                System.out.print("Enter Bill ID to Find: ");
                int searchBillId = sc.nextInt();

                Bill foundBill =
                    billingService.findBillById(searchBillId);

                if (foundBill != null) {
                    foundBill.displayBill();
                } else {
                    System.out.println("Bill Not Found");
                }

                break;


            case 4:

                System.out.println("Going Back");
                break;


            default:

                System.out.println("Invalid Choice");
        }

        if (billChoice == 4) {
            break;
        }
    }

    break;
    case 6:

    while (true) {

        System.out.println("\n===== ROOM MANAGEMENT =====");
        System.out.println("1. Add Room");
        System.out.println("2. Show All Rooms");
        System.out.println("3. Find Room");
        System.out.println("4. Back");

        System.out.print("Enter Your Choice: ");
        int roomChoice = sc.nextInt();

        switch (roomChoice) {

            case 1:

                System.out.print("Enter Room ID: ");
                int roomId = sc.nextInt();

                System.out.print("Enter Room Number: ");
                int roomNumber = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Room Type: ");
                String roomType = sc.nextLine();

                System.out.print("Enter Price Per Night: ");
                double pricePerNight = sc.nextDouble();

                System.out.print("Is Room Available? (true/false): ");
                boolean available = sc.nextBoolean();

                Room newRoom = new Room(
                        roomId,
                        roomNumber,
                        roomType,
                        pricePerNight,
                        available
                );

                newroomservice.addRoom(newRoom);

                // System.out.println("Room added successfully.");

                break;


            case 2:

                newroomservice.showAllRoom();

                break;


            case 3:

                System.out.print("Enter Room ID to Find: ");
                int searchRoomId = sc.nextInt();

                Room foundRoom =
                        newroomservice.findRoomById(searchRoomId);

                if (foundRoom != null) {

                    foundRoom.displayRoom();

                } else {

                    System.out.println("Room Not Found");
                }

                break;


            case 4:

                System.out.println("Going Back");

                break;


            default:

                System.out.println("Invalid Choice");
        }

        if (roomChoice == 4) {
            break;
        }
    }

    break;
                
            
    case 7:

                  
    System.out.println("Thank you for using Hotel Management System!");
    return;
                    

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

}

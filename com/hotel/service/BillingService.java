package com.hotel.service;
import com.hotel.model.Bill;
import java.util.ArrayList;
public class BillingService {
    
    private ArrayList<Bill>billList=new ArrayList<>();

    public void addBill(Bill bill){
        billList.add(bill);
        System.out.println("Bill Added Sucsesfully");
    }
    public void showAllBill(){
        if(billList.isEmpty()){
            System.out.println("No Bill Added ");

            return;
        }
        for(Bill  bill :billList){
            bill.displayBill();
            System.out.println("----------------");        
        }

    }
    public Bill findBillById(int billId){
        for(Bill bill :billList){
            if(bill.getBillId()==billId){
                return bill;
            }
        }
        return null;
    }
    
}

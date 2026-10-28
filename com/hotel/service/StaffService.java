
package com.hotel.service;
import com.hotel.model.Staff;
import java.util.ArrayList;



public class StaffService {

    private ArrayList<Staff> staffList = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Staff added successfully.");
    }

    public void showAllStaff() {

        if (staffList.isEmpty()) {
            System.out.println("No staff found.");
            return;
        }

        for (Staff staff : staffList) {
            staff.displayStaff();
            System.out.println("----------------------");
        }
    }

    public Staff findStaffById(int staffId) {

        for (Staff staff : staffList) {

            if (staff.getStaffId() == staffId) {
                return staff;
            }
        }

        return null;
    }
}

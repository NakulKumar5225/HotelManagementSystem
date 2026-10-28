package com.hotel.model;

public class Staff {
  private int staffId;
  private String name;
  private String phone;
  private String email;
  private String department;
  private double salary;

  public Staff(int staffId, String name, String phone, String email, String department, double salary) {

    this.staffId = staffId;
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.department = department;
    this.salary = salary;
  }

  public int getStaffId() {

    return staffId;

  }

  public String getName() {
    return name;

  }

  public String getPhone() {

    return phone;

  }

  public String getEmail() {
    return email;

  }

  public String getDepartment() {
    return department;

  }

  public double getSalary() {

    return salary;

  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;

  }

  public void setSalary(double salary) {

    if (salary >= 0) {
      this.salary = salary;
    }
  }

  public void displayStaff() {
    System.out.println("Staff ID    :" + staffId);
    System.out.println("Name      :" + name);
    System.out.println("Phone    :" + phone);
    System.out.println("Email   :" + email);
    System.out.println("Department     :" + department);
    System.out.println("Salary   :" + salary);
  }
}

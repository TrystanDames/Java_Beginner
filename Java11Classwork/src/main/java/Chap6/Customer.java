/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap6;

/**
 *
 * @author User
 */
public class Customer {
    public String name = "Sheldon Dames";
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;
    
    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + custID);
        System.out.println("Address: " + address);
        System.out.println("Order Number: " + orderNum);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}

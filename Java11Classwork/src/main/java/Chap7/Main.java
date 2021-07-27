/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap7;

/**
 *
 * @author User
 */
public class Main {
        public static void main(String[] args) {
        Customer customer01 = new Customer("Trystan Dames", 21, "54 Majuba road", 200, 32);
        Customer customer02 = new Customer("Jaden Turnbell", 20, "67 Magic road", 132, 65);
        Customer customer03 = new Customer("Hannah Sawers", 29, "4 Elnita road", 245, 38);
        Customer customer04 = new Customer("Sheldon Dames", 17, "5 Lingerette road", 329, 90);
        
        Customer[] theCustomers = {customer01, customer02, customer03, customer04};
        
        
        for (Customer theCustomer : theCustomers) {
            System.out.println("Customers Name: " + theCustomer.name);
                System.out.println("Customer ID: " + theCustomer.custID);
            System.out.println("Address: " + theCustomer.address);
            System.out.println("Order Number: " + theCustomer.orderNum);
            System.out.println("Age: " + theCustomer.age);
            System.out.println("............");
        }
//        customer01.name = "Jaden";
//        customer01.age = 40;
//        customer01.address = "245 Woodmead Road";
//        customer01.custID = 1267;
//        customer01.orderNum = 342;
        
//        customer01.setName("James Gordon");
//        customer01.setAddress("23 Majuba Road");
//        customer01.setAge(28);
//        customer01.setCustID(111);
//        customer01.setOrderNum(32);
//        
//        
//        System.out.println(customer01.getName());
//        System.out.println(customer01.getAge());
//        System.out.println(customer01.getAddress());
//        System.out.println(customer01.getCustID());
//        System.out.println(customer01.getOrderNum());
//        customer01.displayCustomer();
    }
}

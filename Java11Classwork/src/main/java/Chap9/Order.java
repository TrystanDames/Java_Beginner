/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap9;

/**
 *
 * @author User
 */
public class Order {
    public static void main(String[] args) {
        Item item1 = new Item(10.00);
//        item1.price = 10.00;
//        item.setPrice(10.00);
        System.out.println("Item Price: " + item1.getPrice());
    }
}

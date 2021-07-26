/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap5;

/**
 *
 * @author User
 */
public class ShoppingCart2 {
    public static void main(String[] args) {
        String[] custName = {"Mary Smith", "Trystan Dames", "Jaden Turnbell"};
        String[] items = {"Shirt", "Belt", "Skirt", "Cap"};
        String message;
        
        message = custName[2]+" wants to purchase "+ items.length + " items";
        
        System.out.println(message);
       
        System.out.println("Items purchased: ");
        
        for (String item : items){
            System.out.print(item + ", ");
        }
    }
}

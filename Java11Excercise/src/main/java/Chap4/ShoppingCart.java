/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap4;

/**
 *
 * @author User
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

       double price = 21.99;
       int quantity = 2;
       double total;
       String message = custName+" wants to purchase "+ quantity + " " + itemDesc;

       total = (price*quantity);

       boolean outOfStock = false;

       if (quantity > 1) {
            message = message +"s";
       }

       if (outOfStock){
           System.out.println(itemDesc+" is out of stock");
       }
       else{
           System.out.println(message);
           System.out.println("Total cost with tax: "+total);
       }
    }
}

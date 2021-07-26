/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author User
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String[] custName = {"Mary Smith", "Trystan Dames", "Jaden Turnbell"};
        String[] items = {"Shirt", "Belt", "Skirt", "Cap"};
        String message;

       double price = 21.99;
       int quantity = 2;
       double total;
       message = custName[2]+" wants to purchase "+ items.length + " items";
       System.out.println(message);
       
        System.out.println("Items purchased: ");
        
        for (String item : items){
            System.out.print(item + ", ");
        }
       
//       total = (price*quantity);
//
//       boolean outOfStock = false;
//
//       if (quantity > 1) {
//            message = message +"s";
//       }
//
//       if (outOfStock){
//           System.out.println(itemDesc+" is out of stock");
//       }
//       else{
//           System.out.println(message);
//           System.out.println("Total cost with tax: "+total);
//       }
    }
}

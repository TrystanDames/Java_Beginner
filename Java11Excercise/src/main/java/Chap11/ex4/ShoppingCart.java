/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11.ex4;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("WristBand");
        items.add("Pants");

        System.out.println(items);
        items.add(2, "Belt");
        System.out.println(items);

         if (items.contains ("Shirt")){
           items.remove("Shirt");
         }
         System.out.println(items);
    }
}

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
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Trystan Dames";
        String firstName;
        int Space;
        
        Space = custName.indexOf(" ");

        firstName = custName.substring(0, Space);
        System.out.println(firstName);
    }
}


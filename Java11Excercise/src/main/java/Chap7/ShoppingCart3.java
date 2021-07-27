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
public class ShoppingCart3 {
    public static void main(String[] args) {
        int int1;
        
        long long1 = 99_000_000_000L;
        float flt1 = 13.5F;
        char ch1 = 'U';
  
	System.out.println("long1: "+long1);

        int1 = (int) long1; 
        System.out.println("Long assigned to int var: " + int1);
    }
}


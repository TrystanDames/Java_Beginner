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
public class ShoppingCart2 {
    public static void main (String[] args){
        String custName = "Trystan Dames";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    
        sb = new StringBuilder(firstName);

        sb.append(" Dames");
        
        System.out.println(sb);
    }    
}

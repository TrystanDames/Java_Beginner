/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10;

/**
 *
 * @author User
 */
public class ShoppingCart3 {
    public static void main(String args[]){
        Exercise3 order = new Exercise3("Rick Wilson", 910.00, "VA", Exercise3.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}

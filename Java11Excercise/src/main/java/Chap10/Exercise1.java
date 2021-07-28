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
public class Exercise1 {
    public static void main(String[] args) {
        int x = 4, y = 9;
        
        int s;
        
        s = ((y / x) < 3) ? (x += y) : (x *= y);
        
        System.out.println("Result: " + s);
    }
}

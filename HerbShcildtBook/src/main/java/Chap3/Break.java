/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap3;

/**
 *
 * @author User
 */
public class Break {
    public static void main(String args[]) { 
    int i; 
 
        for(i=0; i<=5; i++) { 
            switch(i) {
                case 1: 
                case 2: 
                case 3: System.out.println("i is 1, 2 or 3"); 
                  break; 
                case 4: System.out.println("i is 4"); 
                  break; 
            }
            System.out.println();
        }
    }
}

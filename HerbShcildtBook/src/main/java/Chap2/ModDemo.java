/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap2;

/**
 *
 * @author User
 */
public class ModDemo {
    public static void main(String args[]) {    
        int iresult, irem; 
        double dresult, drem; 

        iresult = 10 / 3; 
        irem = 10 % 3; 

        dresult = 10.0 / 3.0; 
        drem = 10.0 % 3.0;  

        System.out.println("Result and remainder of 10 / 3: " + 
            iresult + " " + irem); 
        System.out.println("Result and remainder of 10.0 / 3.0: " + 
            dresult + " " + drem); 
 
    }
}

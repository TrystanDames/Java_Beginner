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
public class Vehicle {
    int passengers; // number of passengers  
    int fuelcap;    // fuel capacity in gallons 
    int mpg;        // fuel consumption in miles per gallon 
    
//    void range() { 
//        System.out.println("Range is " + fuelcap * mpg);
//    }
    
//    void myMeth() { 
//        int i; 
//
//        for(i=0; i<10; i++) { 
//          if(i == 5) return; // stop at 5 
//          System.out.println(); 
//        } 
//    }
    
    Vehicle(int p, int f, int m) { 
    passengers = p; 
    fuelcap = f; 
    mpg = m; 
    }
    
    int range() { 
    return mpg * fuelcap; 
    } 
    
    double fuelneeded(int miles) { 
    return (double) miles / mpg; 
  }
}  
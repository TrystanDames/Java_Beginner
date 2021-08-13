/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap6;

/**
 *
 * @author User
 */
public class Backwards {
    // Display a string backwards using recursion.  
  String str; 
 
  Backwards(String s) { 
    str = s; 
  } 
 
  void backward(int idx) { 
    if(idx != str.length()-1) backward(idx+1); 
 
    System.out.print(str.charAt(idx)); 
  } 
}

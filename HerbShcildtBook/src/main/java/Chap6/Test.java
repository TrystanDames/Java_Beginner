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
public class Test {
    int a, b; 
 
  Test(int i, int j) { 
    a = i; 
    b = j; 
  }
  /* Pass an object. Now, ob.a and ob.b in object 
     used in the call will be changed. */ 
  void change(Test ob) { 
    ob.a = ob.a + ob.b; 
    ob.b = -ob.b; 
  } 
}

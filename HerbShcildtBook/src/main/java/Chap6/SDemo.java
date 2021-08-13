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
public class SDemo {
   public static void main(String args[]) {  
    // construct 10-element empty stack 
    Stack stk1 = new Stack(10);  
 
    char name[] = {'T', 'o', 'm'};  
   
    // construct stack from array 
    Stack stk2 = new Stack(name);  
 
    char ch;  
    int i;  
  
    // put some characters into stk1  
    for(i=0; i < 10; i++)  
      stk1.push((char) ('A' + i));  
 
    // construct stack from another stack 
    Stack stk3 = new Stack(stk1); 
 
    //show the stacks. 
    System.out.print("Contents of stk1: ");  
    for(i=0; i < 10; i++) {   
      ch = stk1.pop();  
      System.out.print(ch);  
    }  
  
    System.out.println("\n");  
  
    System.out.print("Contents of stk2: ");  
    for(i=0; i < 3; i++) {   
      ch = stk2.pop();  
      System.out.print(ch);  
    }  
  
    System.out.println("\n");  
  
    System.out.print("Contents of stk3: ");  
    for(i=0; i < 10; i++) {   
      ch = stk3.pop();  
      System.out.print(ch);  
    }  
  }{
    StaticDemo ob1 = new StaticDemo();
    StaticDemo ob2 = new StaticDemo();

    // Each object has its own copy of an instance variable.
    ob1.x = 10;
    ob2.x = 20;
    System.out.println("Of course, ob1.x and ob2.x " +
                       "are independent.");
    System.out.println("ob1.x: " + ob1.x +
                       "\nob2.x: " + ob2.x);
    System.out.println();

    // Each object shares one copy of a static variable.
    System.out.println("The static variable y is shared.");
    StaticDemo.y = 19;
    System.out.println("Set StaticDemo.y to 19.");

    System.out.println("ob1.sum(): " + ob1.sum());
    System.out.println("ob2.sum(): " + ob2.sum());
    System.out.println();

    StaticDemo.y = 100;
    System.out.println("Change StaticDemo.y to 100");

    System.out.println("ob1.sum(): " + ob1.sum());
    System.out.println("ob2.sum(): " + ob2.sum());
    System.out.println();  
    }
}

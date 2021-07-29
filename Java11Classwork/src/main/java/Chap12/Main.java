/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short sleeve");
        
        shirt01.display();
        
        Pants pants01 = new Pants(18, "Formal", 'G', 45.99, 'M', 36.6, 'F');
        
        pants01.display();
    }
}

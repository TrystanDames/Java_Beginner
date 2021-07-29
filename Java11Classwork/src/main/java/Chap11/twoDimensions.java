/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;

/**
 *
 * @author User
 */
public class twoDimensions {
    public static void main(String[] args) {
        int[][] yearlySales;
        int year = 2017;
        
        yearlySales = new int[4][4];
        
        yearlySales [0][0] = 1000;
        yearlySales [0][1] = 2100;
        yearlySales [0][2] = 3200;
        yearlySales [0][3] = 4300;
        yearlySales [1][0] = 5400;
        yearlySales [1][1] = 6000;
        yearlySales [1][2] = 7100;
        yearlySales [1][3] = 8200;
        yearlySales [2][0] = 9300;
        yearlySales [2][1] = 1400;
        yearlySales [2][2] = 2100;
        yearlySales [2][3] = 3200;
        yearlySales [3][0] = 4300;
        yearlySales [3][1] = 5400;
        yearlySales [3][2] = 6500;
        yearlySales [3][3] = 7600;
        
        for (var i = 0; i < yearlySales.length; i++){
            System.out.println("Year " + year + ": ");
            year = year + 1;
            for (var j = 0; j < yearlySales[i].length; j++){
                System.out.println("\tQ"+(j+1) + ": " + yearlySales[i][j]);
            }
            
            System.out.println("\n");
        }
    }
}

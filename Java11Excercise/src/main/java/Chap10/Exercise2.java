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
public class Exercise2 {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Exercise2(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (custType == NONPROFIT){
            if (total > 900){
                discount = 10;
            } else {
                discount = 8;
            }
        } else if (custType == PRIVATE){
            if (total > 900){
                discount = 7;
            } else {
                discount = 0;
            }
        } else if (custType == CORP){
            if (total > 500){
                discount = 8;
            } else {
                discount = 5;
            }
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author User
 */
public class Student {
    private String firtsName;
    private String lastName;
    private int age;
    private String email;
    private String cellNum;
    private String idNum;

    public Student(String firtsName, String lastName, int age, String email, String cellNum, String idNum) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.cellNum = cellNum;
        this.idNum = idNum;
    }

    public Student(String firtsName) {
        this.firtsName = firtsName;
    }

    public Student(String firtsName, String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public Student(String firtsName, String lastName, int age) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String firtsName, String lastName, int age, String email) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Student(String firtsName, String lastName, int age, String email, String cellNum) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.cellNum = cellNum;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCellNum() {
        return cellNum;
    }

    public String getIdNum() {
        return idNum;
    }
    
    public String getStudentDetails() {
        return "Name: " + firtsName + " " + lastName + "\n" + 
                "Age: " + age + "\n" + 
                "Email: " + email + "\n" + 
                "Cell Number: " + cellNum + "\n" + 
                "ID Number: " + idNum + "\n";
    } 
}

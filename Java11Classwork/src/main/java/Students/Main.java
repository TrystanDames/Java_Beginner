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
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Trystan", "Dames", 21, "trystan@g.com", "0636845678", "0008085076096");
        Student student2 = new Student("Jaden", "Turnbull", 19, "jaden@h.com", "0847890234", "0206236789124");
        Student student3 = new Student("Sheldon", "Halls", 17, "shell@f.com", "0763457129", "0410045467821");
        Student student4 = new Student("Hannah", "Sawers", 20, "hana@g.com", "0834698722", "0103215678233");
        Student student5 = new Student("Lourens", "Norris", 18, "loun@l.com", "0987652341", "0312096758901");
    
        Student[] theStudents = {student1, student2, student3, student4, student5};
        
//        for (Student theStudent: theStudents){
//            System.out.println("Students First Name: " + theStudent.getFirtsName());
//            System.out.println("Students Last Name: " + theStudent.getLastName());
//            System.out.println("Students age: " + theStudent.getAge());
//            System.out.println("Email: " + theStudent.getEmail());
//            System.out.println("Cell Number: " + theStudent.getCellNum());
//            System.out.println("Students ID: " + theStudent.getIdNum());
//            System.out.println("............\n");
//        }
        
        for (Student theStudent: theStudents)
            System.out.println(theStudent.getStudentDetails());
    }
}

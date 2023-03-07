/*
 * Kyle Moore
 * Inheritance & Polymorphism
 * Tuesday, March 30, 2021
 * This program will demonstrate proper use of inheritance and polymorphism using superclasses and subclasses, including using the concept of overriding.
 */

import java.util.Scanner;

//Class: mooreInheritance
public class mooreInheritance {
    
    //main
    public static void main(String[] args) {
        
        //Create objects for respective classes
        Person person = new Person("person");
        Student student = new Student("student");
        Employee employee = new Employee("employee");
        Faculty faculty = new Faculty("faculty");
        Staff staff = new Staff("staff");
        
        //Calls respective toString Functions.
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
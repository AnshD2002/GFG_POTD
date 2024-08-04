/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
/*Write a Java program to create a class called "Employee"
with a name, job title, and salary attributes, and methods
to calculate and update salary.*/
public class employee {
    String name;
    String jobtitle;
    int salary;
    
    void updatesalary(String name, String jobtitle,int salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    void printsalary(){
        System.out.println("Name : "+ name );
        System.out.println("Job : "+ jobtitle );
        System.out.println("salary : "+ salary );
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.updatesalary("meenu", "press", 20000);
        e1.printsalary();
    }
}

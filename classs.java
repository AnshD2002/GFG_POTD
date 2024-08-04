/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
/*Write a Java program to create a class called "Person"
with a name and age attribute.Create two instances of the
"Person" class,set their attributes using the constructor,
and print their name and age.*/
class person{
    String name;
    int age;
}
public class classs {
    public static void main(String[] args) {
        person  p1 = new person();
        p1.name = "rahul";
        p1.age=21;
        person p2 = new person();
        p2.name = "rajeev";
        p2.age=22;
    }
        
}

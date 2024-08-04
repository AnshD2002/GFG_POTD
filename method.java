/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */

/*Write a Java program to create a class called "Dog"
with a name and breed attribute. Create two instances
of the "Dog" class, set their attributes using the
constructor and modify the attributes using the
setter methods and print the updated values.*/
class Dog{
    String name;
    String breed;
    void setter(String name, String breed){
        this.name = name;
        this.breed = breed;
        System.out.println("Name : "+name);
        System.out.println("Breed : "+breed);
    }

}
public class method {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();   
        d1.setter("raju", "pomerian");
        d2.setter("digi", "labra");
    }
}

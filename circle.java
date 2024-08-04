/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
/* Write a Java program to create a class called "Circle"
with a radius attribute. You can access and modify this
attribute. Calculate the area and circumference of the
circle.*/
public class circle {
    int radius;
    void circle(int radius){
        this.radius = radius;
        area();
        circumference();
    }
    
    void area(){
        System.out.println("Area of the circle : " + (Math.PI*radius*radius));
    }
    void circumference(){
        System.out.println("Area of the circumference : " + (2*Math.PI*radius));
    }
    public static void main(String[] args) {
        circle c= new circle();
        c.circle(20);
    }
   
}

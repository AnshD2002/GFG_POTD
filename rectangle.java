/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */

/*Write a Java program to create a class called "Rectangle" with
width and height attributes. Calculate the area and perimeter of the rectangle.*/
public class rectangle {
    int width ;
    int height;
     void rect(int height ,int width){
        this.height = height;
        this.width = width;
        area();
        perimeter();
    }
    void area(){
        int area = height*width;
        System.out.println("Area of rectangle is : " + area);
    }
    void perimeter(){
        int perimeter = 2*height + 2*width;
        System.out.println("Perimeter of the rectangle is : "+ perimeter);
    }
    public static void main(String[] args) {
         rectangle r = new rectangle();
         r.rect(10, 4);
    }
}

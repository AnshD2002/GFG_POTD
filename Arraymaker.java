/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
public class Arraymaker {

    public static void main(String[] args) {
      String  x = "[[1, 0, 0, 0],[1, 1, 0, 1], [1, 1, 0, 0],[0, 1, 1, 1]]";
      String  ans = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)=='['){
                ans = ans+'{';
            }
            else if (x.charAt(i)==']'){
                ans = ans+'}';
            }
            else{
                ans = ans+x.charAt(i);
            }
        }
        System.out.println(ans);
        
        
    }
    
}


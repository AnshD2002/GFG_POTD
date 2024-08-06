/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
import java.util.ArrayList;
class Sol{
    public boolean isValid(String str) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String x ="";
        str=str+'.';
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!='.') {
                x=x+str.charAt(i);
            }
            else if (str.charAt(i)=='.'){
                a = Integer.parseInt(x);
                if (0<=a && a<=255) {
                    arr.add(a);
                }
                else{
                    return false;
                }
                x="";
            }
        }
        return true;
    }
}
public class POTD {
    public static void main(String[] args) {
        String str = "125.0.5.256";
        Sol obj = new Sol();
        System.out.println(obj.isValid(str));
    }
}

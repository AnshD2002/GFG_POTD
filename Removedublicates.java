/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
public class Removedublicates {

     public static  String removeDups(String str) {
        // code here
        StringBuilder ans = new StringBuilder();
        boolean temp[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(!temp[x-'a']){
                ans.append(x);
                temp[x-'a']=true;
            }
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        String s = "maam";
        Removedublicates obj = new Removedublicates();
        String x = removeDups("anna");
        System.out.println(x);
    }
}

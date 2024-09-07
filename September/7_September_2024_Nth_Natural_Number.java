/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
class Solution {

    long findNth(long n) {
        long result = 0;
        long place = 1;
        while (n > 0) {
            long rem = n % 9;
            result += rem * place;
            n = n / 9;
            place = place * 10;
        }
        return result;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int n=8;
        System.out.println(obj.findNth(n));
    }
}

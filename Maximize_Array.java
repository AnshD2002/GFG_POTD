/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

import java.util.Arrays;

/**
 *
 * @author ansh
 */

class Solution {
    int mod = 1000000007;

    int Maximize(int[] arr) {
        Arrays.sort(arr);  // Sort the array
        long ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            ans = (ans + (long)arr[i] * i) % mod;
        }
        return (int) ans;
    }
}

public class Maximize_Array {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {5, 4, 2, 3, 1,54,57,95,48,35,545,854};
        System.out.println(obj.Maximize(arr));
    }
}

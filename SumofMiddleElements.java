/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
import java.util.Arrays;
class Solution {
     int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int range = arr1.length+arr2.length;
        int j = 0;
        int arr[] = new int[range];
        for(int i=0;i<range;i++){
            if (i<arr1.length) {
                arr[i] = arr1[i];
            }
            else{
                j = i-(arr1.length);
                arr[i] = arr2[j];
            }
        }
        Arrays.sort(arr);
        int middle = Math.abs(arr.length/2);
        return arr[middle]+arr[middle-1];
    }
}
public class SumofMiddleElements {
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(a.SumofMiddleElements(arr1, arr2));
    }
    
}

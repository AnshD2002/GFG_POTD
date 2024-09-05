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
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;


class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        int missingNumber = totalSum - arraySum;
        return missingNumber;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] nums = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};
        int[] nums1 = {1,2,3,5};
        System.out.println(obj.missingNumber(5,nums1));
    }
}



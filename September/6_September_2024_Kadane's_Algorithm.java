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
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        // Your code here
        
        long max_sum = arr[0];
        long current_max_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current_max_sum = Math.max(arr[i], current_max_sum + arr[i]);
            max_sum = Math.max(current_max_sum, max_sum);

        }
        return max_sum;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = {1, 2, 3, -2, 5};
        System.out.println(obj.maxSubarraySum(nums1));
    }
}

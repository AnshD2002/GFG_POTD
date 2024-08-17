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
    public static long[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        // Initialize answer array with 1
        Arrays.fill(ans, 1);

        // Calculate prefix products
        int left = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= left;
            left *= nums[i];
        }

        // Calculate suffix products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        //String str1 = "ABCDGH";
        //String str2 = "ACDGHR";
        //int n = 15;
        //int x = 2, y = 5, z = 6;
        int[] nums = {10, 3, 5, 6, 2};
        System.out.println(obj.productExceptSelf(nums));
    }
}

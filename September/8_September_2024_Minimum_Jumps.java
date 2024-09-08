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

    int minJumps(int[] arr) {
        // your code here
        if(arr[0]==0)return -1;
        int ans = 1, jump = arr[0], mx = 0;
        for(int i=1;i<arr.length;i++){
            mx--;
            jump--;
            mx=Math.max(mx,arr[i]);
            if(jump==0 && i!=arr.length-1){
                if(mx<=0)return -1;
                jump=mx;
                mx=0;
                ans++;
            }
        }
        return ans;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        //String str1 = "heap";
        //String str2 = "pea";
        //int n = 15;
        //int x = 2, y = 5, z = 6;
        int[][] nums = {{9, 4, 9, 9}, {6, 7, 6, 4}, {8, 3, 3, 7}, {7, 4, 9, 10}};
        int[] nums1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=8;
        System.out.println(obj.minJumps(nums1));
    }
}

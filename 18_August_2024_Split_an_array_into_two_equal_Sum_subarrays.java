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
    public boolean canSplit(int arr[]) {
        // code here
        int sum = 0,firstSum=0;
        for(int x:arr)sum+=x;
        for(int x:arr){
            sum-=x;
            firstSum+=x;
            if(firstSum==sum)return true;
        }
        return false;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        //String str1 = "ABCDGH";
        //String str2 = "ACDGHR";
        //int n = 15;
        //int x = 2, y = 5, z = 6;
        int[] nums = {1, 2, 3, 4, 5, 5};
        System.out.println(obj.canSplit(nums));
    }
}

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
    public int kthSmallest(int[] arr, int k) {
        // Your code here
        int mx = Integer.MIN_VALUE;
        for(int x:arr)mx=Math.max(x,mx);
        int hash[] = new int[mx+1];
        Arrays.fill(hash,0);
        for(int x:arr)hash[x]=1;
        for(int i=1;i<=mx;i++){
            k-=hash[i];
            if(k==0)return i;
        }
        return 0;
    }
    
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        //String str1 = "ABCDGH";
        //String str2 = "ACDGHR";
        //int n = 15;
        //int x = 2, y = 5, z = 6;
        int[] nums = {7, 10, 4, 3, 20, 15};
        System.out.println(obj.kthSmallest(nums,4));
    }
}

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

class Solution
{
    //Function to find the maximum number of cuts.
    int help(int n,int x,int y,int z,int dp[]){
        if(n<0)return Integer.MIN_VALUE;
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=1+Math.max(help(n-x,x,y,z,dp),Math.max(help(n-y,x,y,z,dp),help(n-z,x,y,z,dp)));
    }
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = help(n,x,y,z,dp);
        return ans<0?0:ans;
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        int n = 15;
        int x = 2, y = 5, z = 6;
        System.out.println(obj.maximizeCuts(n, x, y, z));
    }
}

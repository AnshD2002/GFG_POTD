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


class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int n = str1.length(), m = str2.length();
	    int dp[][] = new int[n+1][m+1];
	    for(int i=0;i<=n;i++)dp[i][0]=0;
	    for(int j=0;j<=m;j++)dp[0][j]=0;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=m;j++){
	            dp[i][j] = str1.charAt(i-1)==str2.charAt(j-1)?1+dp[i-1][j-1]:Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    return n+m-2*dp[n][m];
	} 
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        String str1 = "heap";
        String str2 = "pea";
        System.out.println(obj.minOperations(str1,str2));
    }
}



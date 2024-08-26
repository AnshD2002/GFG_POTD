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
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int n = pattern.length();
        int m = str.length();
        
        // DP table of size (n+1)x(m+1)
        boolean[][] dp = new boolean[n + 1][m + 1];
        
        // Base case: empty pattern and empty string match
        dp[0][0] = true;
        
        // Handle patterns with '*' at the beginning (it can match an empty string)
        for (int i = 1; i <= n; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (pattern.charAt(i - 1) == '?' || pattern.charAt(i - 1) == str.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        
        // Return 1 if pattern matches str, otherwise return 0
        return dp[n][m] ? 1 : 0;

    
    }
}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2,3,4,5};
        int[] nums1 = {1,2,3};
        System.out.println(obj.wildCard("ba*a?","baaabab"));
    }
}

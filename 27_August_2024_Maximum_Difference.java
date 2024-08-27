/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
import java.util.Stack;


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty() && st.peek()>=arr[i])st.pop();
            if(!st.empty())left[i]=st.peek();
            else left[i]=0;
            st.push(arr[i]);
        }
        while(!st.empty())st.pop();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()>=arr[i])st.pop();
            if(!st.empty())right[i]=st.peek();
            else right[i]=0;
            st.push(arr[i]);
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,Math.abs(left[i]-right[i]));
        }
        return ans;
    }

}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2,3,4,5};
        int[] nums1 = {1,2,3};
        System.out.println(obj.findMaxDiff(nums));
    }
}

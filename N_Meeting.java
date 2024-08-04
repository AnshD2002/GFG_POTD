/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ansh
 */
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int temp[][] = new int[n][2];
        for(int i=0;i<n;i++){
            temp[i][0]=end[i];
            temp[i][1]=start[i];
        }
        Arrays.sort(temp,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        int ans = 1,last = temp[0][0];
        for(int i=1;i<n;i++){
            if(temp[i][1]>last){
                ans++;
                last=temp[i][0];
            }
        }
        return ans;
    }
}
public class N_Meeting {
    public static void main(String[] args) {
        int n = 6;
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =  {2, 4, 6, 7, 9, 9};
        //int[] start = {10,12,20};
        //int[] end =  {20,25,30};
        Solution obj= new Solution();
        System.out.println(obj.maxMeetings(n, start, end));
    }
}

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


class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        int n = arr.length;
        HashMap<Integer,Integer> mm = new HashMap<>();
        int vec[][] = new int[n][2];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x:arr)mm.put(x,mm.getOrDefault(x,0)+1);
        for(int i=0;i<n;i++){
            vec[i][0]=arr[i];
            vec[i][1]=mm.get(arr[i]);
        }
        Arrays.sort(vec,new Comparator<int[]>(){
            @Override
            public int compare(int a[],int b[]){
                if(a[1]!=b[1])return b[1]-a[1];
                return a[0]-b[0];
            }
        });
        for(int i=0;i<n;i++)ans.add(vec[i][0]);
        return ans;
    }

}

public class Gfg {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {5,5,4,6,4};
        System.out.println(obj.sortByFreq(nums));
    }
}

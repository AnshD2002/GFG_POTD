/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
class Solution{
    public long kthElement(int k, int arr1[], int arr2[]) {
        int i = 0,j = 0,ans = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>=arr2[j]) ans = arr2[j++];
            else ans = arr1[i++];
            k--;
            if(k==0) return ans;
        }
        while(i<arr1.length && k-- !=0) ans = arr1[i++];
        while(j<arr2.length && k-- !=0) ans = arr2[j++];
        return ans;
    }
}
public class Kth_element {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k=5;
        System.out.println(obj.kthElement(k, arr1, arr2));;
    }
}

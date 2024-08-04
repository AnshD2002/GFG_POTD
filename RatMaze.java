/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

import java.util.ArrayList;

/**
 *
 * @author ansh
 */

class Solution {
    boolean issafe(int[][] mat,int i,int j){
        if(i<mat.length && j<mat.length && mat[i][j]==1){
            return true;
        }
        else {
            return false;
        }
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(issafe(mat,i,j)){
                    System.out.println(i+""+j);
                    break;
                }
            }   
        }
        return null;
    }
}
public class RatMaze {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        SpiralMat obj = new SpiralMat();
        obj.findPath(arr);
    }
}

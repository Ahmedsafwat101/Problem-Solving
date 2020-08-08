package com.AhmedSafwat;
import java.util.*;
/**
 * 437. Path Sum III
 * https://leetcode.com/problems/path-sum-iii/
 * **/
public class PathSumIII {
    int counter=0;
    public int pathSum(TreeNode root, int sum) {
        findPaths(root,sum,0,new ArrayList<Integer>());
        return counter;
    }
    private void findPaths(TreeNode root, int sum,int currentSum,ArrayList<Integer>current){
        if(root==null)return;
         current.add(root.val);
         currentSum+=root.val;
         int tempSum= currentSum;
         for(Integer i:current){
             if(sum==tempSum) counter++;
             tempSum-=i;
         }

        findPaths(root.left,sum,currentSum,new ArrayList<>(current));
        findPaths(root.right,sum,currentSum,new ArrayList<>(current));

    }
}

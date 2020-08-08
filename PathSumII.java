package com.AhmedSafwat;
import java.util.*;
/**
 *  113. Path Sum II
 *  https://leetcode.com/problems/path-sum-ii/
 ***/
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths= new ArrayList<>();

        return paths;
    }
    private void findPaths(TreeNode root, int sum,ArrayList<Integer>current, List<List<Integer>> paths){
        if(root==null) return;

        current.add(root.val);

        if(root.left==null && root.right==null) {
            if (sum == root.val) {
                paths.add(current);
                return;
            }
        }
        findPaths(root.left,sum-root.val,new ArrayList<>(current),paths);
        findPaths(root.right,sum-root.val,new ArrayList<>(current),paths);

    }
}

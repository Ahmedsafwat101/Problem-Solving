package com.AhmedSafwat;
import java.util.*;
/*
* 897. Increasing Order Search Tree
* https://leetcode.com/problems/increasing-order-search-tree/
*/
public class IncreasingOrderSearchTree {
    List<Integer> nodes= new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        HelperTraversal(root);
        TreeNode answer= new TreeNode(nodes.get(0)), currentNode= answer;
        for(int i=1;i<nodes.size();i++){
            currentNode.right= new TreeNode(nodes.get(i));
            currentNode= currentNode.right;
        }
        return answer;
    }

    private void HelperTraversal(TreeNode root){
        if(root==null) return;
        HelperTraversal(root.left);
        nodes.add(root.val);
        HelperTraversal(root.right);
    }
}

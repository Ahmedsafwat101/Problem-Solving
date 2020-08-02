package com.AhmedSafwat;
//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

/*
* 938. Range Sum of BST
* https://leetcode.com/problems/range-sum-of-bst/
*/
public class RangeSumOfBST {
    int sum=0;
    boolean start= false;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        rangeSumBST(root.left,L,R);
        if(root.val==L || start==true){
            sum+=root.val;
            start=true;
        }
        if(root.val==R){
            start=false;
        }
        rangeSumBST(root.right,L,R);
        return sum;
    }
}

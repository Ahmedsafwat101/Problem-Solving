package com.AhmedSafwat;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
 /*class TreeNode {
  *    int val;
  *    TreeNode left;
  *    TreeNode right;
  *    TreeNode() {}
  *    TreeNode(int val) { this.val = val; }
  *    TreeNode(int val, TreeNode left, TreeNode right) {
  *        this.val = val;
  *        this.left = left;
  *        this.right = right;
  *    }
}*/
/*
* 617. Merge Two Binary Trees
* https://leetcode.com/problems/merge-two-binary-trees/
*/

public class MergeTwoBinaryTrees {
    // First Solution O(n) Space & O(n) complexity DFS
     public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
         if(t1== null) return t2;
         if(t2== null) return  t1;

         TreeNode node= new TreeNode(t1.val+t2.val);

         node.left= mergeTrees(t1.left,t2.left);
         node.right= mergeTrees(t1.right,t2.right);
         return node;
     }

     // Second Solution O(m) Space & O(n) complexity => m is the difference between t1 & t2 nodes DFS
     public TreeNode mergeTrees2(TreeNode t1, TreeNode t2){
         if(t1== null) return t2;
         if(t2== null) return  t1;

         t1.val= (t1.val+t2.val);

         t1.left= mergeTrees2(t1.left,t2.left);
         t1.right= mergeTrees2(t1.right,t2.right);
         return t1;
     }

    // Third Solution O(n) Space & O(n) complexity BFS
    public TreeNode mergeTrees3(TreeNode t1, TreeNode t2){
         if(t1== null) return  t2;
         Queue<TreeNode[]>queue = new LinkedList<>();
         queue.add(new  TreeNode[]{t1,t2});
         while (queue.size()>0){
             TreeNode[] temp = queue.poll();
             if(t1==null || t2==null) // To handel the leaves at the end of the trees
                 continue;

             temp[0].val+= temp[1].val;

             if(temp[0].left==null)  //To handel if the left child of the node is null  in t1
                 temp[0].left= temp[1].left;
             else
                 queue.add(new TreeNode[]{temp[0].left,temp[1].left});

             if(temp[0].right==null)  //To handel if the left child of the node is null  in t1
                 temp[0].right= temp[1].right;
             else
                 queue.add(new TreeNode[]{temp[0].right,temp[1].right});
         }
         return t1;
     }

}

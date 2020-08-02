package com.AhmedSafwat;
/*
* 700. Search in a Binary Search Tree
* https://leetcode.com/problems/search-in-a-binary-search-tree/
*/
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!= null){
            if(root.val>val){
                root=root.left;
            }
            else if(root.val<val){
                root=root.right;
            }
            else if(root.val==val)
                return root;
        }
        return null;
    }
}

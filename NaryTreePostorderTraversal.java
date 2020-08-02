package com.AhmedSafwat;

import java.util.*;
/*
* 590. N-ary Tree Postorder Traversal
* https://leetcode.com/problems/n-ary-tree-postorder-traversal/submissions/
*/

public class NaryTreePostorderTraversal {
    public List<Integer>postorder(Node root) {
        if(root==null) return null;
        List<Integer>answer= new ArrayList<>();
        Stack<Node>nodeStack= new Stack<>();
        nodeStack.push(root);
        while (nodeStack.size()>0){
            Node temp= nodeStack.pop();
            answer.add(0,temp.val);
            for(int i=0;i<temp.children.size();i++){
                nodeStack.push(temp.children.get(i));
            }
        }
        return answer;
    }
}

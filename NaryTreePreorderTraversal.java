package com.AhmedSafwat;
import java.util.*;
/*
* 589. N-ary Tree Preorder Traversal
*  https://leetcode.com/problems/n-ary-tree-preorder-traversal/
*/
public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
            if (root == null) return new ArrayList<>();
            List<Integer> answer = new ArrayList<>();
            Stack<Node> stackNodes = new Stack<>();
            stackNodes.add(root);
            while (stackNodes.size() > 0) {
                Node temp = stackNodes.pop();
                answer.add(temp.val);
                for (int i = temp.children.size() - 1; i >= 0; i--) {
                    stackNodes.push(temp.children.get(i));
                }
            }
            return answer;
        }
    }



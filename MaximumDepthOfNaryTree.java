package com.AhmedSafwat;
import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
class Pair{
    Node node;
    Integer level;

    public Pair(Node node, Integer level) {
        this.node = node;
        this.level = level;
    }

    public Node getNode() {
        return node;
    }

    public Integer getLevel() {
        return level;
    }
}
/*
* 559. Maximum Depth of N-ary Tree
* https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/
*/
public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        if(root== null) return 0;
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(root,1));
        int depth=0;
        while (queue.size()>0){

            Pair pair= queue.poll();
            int current_Depth= pair.getLevel();
            depth= Math.max(current_Depth,depth);
            for(int i=0;i<pair.getNode().children.size();i++){
                queue.add(new Pair(pair.getNode().children.get(i),current_Depth+1));
            }
        }
        return depth;
    }
}

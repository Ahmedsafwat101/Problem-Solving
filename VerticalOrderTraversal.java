package com.AhmedSafwat;
import java.util.*;
/**
 * 987. Vertical Order Traversal of a Binary Tree
 * https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 * */
public class VerticalOrderTraversal {
    Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root==null) return null;
        map= new TreeMap<>();
        DFS(root,0,0);
        List<List<Integer>>ans= new LinkedList<>();
      /** Extract values from map **/
      for(int key: map.keySet()){
          List<Integer>list= new LinkedList<>();
          TreeMap<Integer, PriorityQueue<Integer>> map2 = map.get(key);
          for(int key2: map2.keySet()){
              PriorityQueue<Integer>pq= map2.get(key2);
              while (!pq.isEmpty()){
                  list.add(pq.poll());
              }
          }
          ans.add(list);
      }
      return ans;
    }

    private void DFS(TreeNode root, int xCo,int level ) {
        if(root==null) return;

        int val= root.val;
        map.putIfAbsent(xCo,new TreeMap<>());
        map.get(xCo).putIfAbsent(level,new PriorityQueue<>());
        map.get(xCo).get(level).add(val);
        DFS(root.left,xCo-1,level+1);
        DFS(root.right,xCo+1,level+1);
    }
}
















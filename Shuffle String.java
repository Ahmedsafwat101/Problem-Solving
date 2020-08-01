package com.AhmedSafwat;
import java.util.*;
/*
* 1528. Shuffle String
* https://leetcode.com/problems/shuffle-string/
*  */

public class Solution2 {
    /*
      O(n) complexity
      O(n) Space
    */
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            ans.append(map.get(i));
        }
        return ans.toString();
    }
    /*
      O(n) complexity
      O(1) Space
    */
    public String restoreString2(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
    }
}

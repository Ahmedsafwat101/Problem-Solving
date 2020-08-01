package com.AhmedSafwat;

import java.util.*;


/*
*1002- Find Common Characters
*https://leetcode.com/problems/find-common-characters/
*/
public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> common_Chars = new ArrayList<>();
        int[] mini_Frequencies = new int[26];
        Arrays.fill(mini_Frequencies, Integer.MAX_VALUE);

        for(String word : A){

            int[] current_Mini_Frequencies = new int[26];

            for(char c : word.toCharArray()){
                current_Mini_Frequencies[c-'a']++;
            }
            for(int i=0;i<26;i++){
                mini_Frequencies[i]=Math.min(mini_Frequencies[i],current_Mini_Frequencies[i]);
            }

        }

        for(int i=0;i<26;i++){
            while ( mini_Frequencies[i]>0){
                common_Chars.add(""+(char)(i+'a'));
                mini_Frequencies[i]--;
            }
        }
        return common_Chars;
    }
}

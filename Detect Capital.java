package com.AhmedSafwat;
/*
* 520. Detect Capital
* https://leetcode.com/problems/detect-capital/
*/
public class Solution3 {
    public boolean detectCapitalUse(String word) {

        if(allCapital(word)) return true;
        else if(allSmall(word)) return true;
        else if(onlyFirstCapital(word))return true;
        return false;
    }

    private boolean  allCapital(String word){
        String newWord= word.toUpperCase();
        if(word.equals(newWord)) return true;
        return false;

    }

    private boolean allSmall(String word){
        String newWord= word.toLowerCase();
        if(word.equals(newWord)) return true;
        return false;
    }

    private boolean onlyFirstCapital(String word){

          if(Character.toUpperCase(word.charAt(0))!=word.charAt(0))return false;

          for(int i=1;i<word.length();i++){
              if(Character.toUpperCase(word.charAt(i))==word.charAt(i)) return false;
          }
          return true;
    }
}

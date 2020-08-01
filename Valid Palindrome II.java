package com.AhmedSafwat;
/*
* 680. Valid Palindrome II
* https://leetcode.com/problems/valid-palindrome-ii/
*/
public class Solution4 {
    public boolean validPalindrome(String s) {
        int left=0;
        int right= s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }

            else if(s.charAt(left)!=s.charAt(right)) {
                return ((helperValidPalindrome(left+1,right,s)) || (helperValidPalindrome(left,right-1,s)));
            }

        }
        return true;
    }

    private boolean helperValidPalindrome(int left, int right, String s){
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}

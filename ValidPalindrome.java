package com.AhmedSafwat;
/*
* 125. Valid Palindrome
* https://leetcode.com/problems/valid-palindrome/
*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0)
            return true;
        StringBuilder newString= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                newString.append(s.charAt(i));
            }
        }
        newString =new StringBuilder(newString.toString().toLowerCase());
        System.out.println(newString.toString());

        return (validPalindrome(newString.toString()));
    }

    private boolean validPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                right--;
                left++;
            }
            else return false;
        }
        return true;
    }
}

package com.AhmedSafwat;
/**
 * 299. Bulls and Cows
 * https://leetcode.com/problems/bulls-and-cows/
 * **/
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        StringBuilder S1= new StringBuilder();
        StringBuilder S2= new StringBuilder();
        int cows=0;
        int bulls=0;
          /** Count the bulls **/
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                S1.append(secret.charAt(i));
                S2.append(guess.charAt(i));
            }
            else
                bulls++;
        }
        /**Frequency array of Size 10 fixed size **/
        char[]freq= new char[10];
        for(int i=0;i<S1.length();i++){
            char ch= S1.charAt(i);
            freq[ch-'0']++;
        }
          /** Count the cows **/
        for(int i=0;i<S2.length();i++){
            char ch= S2.charAt(i);
            if(freq[ch-'0']!=0){

                 if(S2.charAt(i)!=S1.charAt(i) && freq[ch-'0']>0){
                    cows++;
                }
                freq[ch-'0']--;
            }
        }
        StringBuilder ans= new StringBuilder();
        ans.append(bulls);
        ans.append("A");
        ans.append(cows);
        ans.append("B");
        return ans.toString();
    }
}

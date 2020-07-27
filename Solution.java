package com.AhmedSafwat;

public class Solution {
    public int maxScore(String s) {
        int nOfzeros=0;
        int nOfones=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') nOfzeros++;
            else if (s.charAt(i)=='1') nOfones++;
        }

        // special case
        if(nOfzeros==0) return nOfones-1;
        if(nOfones==0) return nOfzeros-1;

        int nOfzerosR=0;
        int nOfzerosL=nOfzeros;

        int nOfonesR=0;
        int nOfonesL=nOfones;

        int length= s.length();
        int max=Integer.MIN_VALUE;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                nOfzerosR++;
                nOfzerosL--;
            }
            else if(s.charAt(i)=='1'){
                nOfonesR++;
                nOfonesL--;
            }
            int current= nOfzerosR+(nOfonesL);
            max=Math.max(max,current);
        }
        return max;
    }
}

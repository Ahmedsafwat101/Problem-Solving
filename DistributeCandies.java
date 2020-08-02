package com.AhmedSafwat;
/*
* 1103. Distribute Candies to People
* https://leetcode.com/problems/distribute-candies-to-people/
*/
public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {

        int [] ans= new int [num_people];
        int i=0;
        int givenCandaies=1;
        while(candies>0){

            if(givenCandaies<candies){
                ans[i%num_people]+=givenCandaies;
                candies-=givenCandaies;
                givenCandaies++;
                i++;
            }
            else
            {
                ans[i%num_people]+=candies;
                break;
            }
        }
        return ans;
    }
}

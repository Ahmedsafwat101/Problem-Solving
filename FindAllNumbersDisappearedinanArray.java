package com.AhmedSafwat;
import java.util.*;
/**
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * **/
class FindAllNumbersDisappearedInanArray {
    /** O(n)space & O(n)runTime **/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) integers.add(i);
        }
        return integers;
    }
    /** O(1)space & O(n)runTime **/
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> integers = new ArrayList<>();

        for(Integer number: nums){
            if(number<0) number*=-1;
            int indexNumber=number-1;
            if(nums[indexNumber]>0)
                nums[indexNumber]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) integers.add(i+1);
        }

        return integers;
    }
}


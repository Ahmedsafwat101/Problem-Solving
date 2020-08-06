package com.AhmedSafwat;
import java.util.*;
/**
 * 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * **/
public class FindAllDuplicatesInArray {
    /** O(n)space & O(n)runTime **/
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>integers= new ArrayList<>();
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                integers.add(nums[i]);
            else
                set.add(nums[i]);
        }
        return integers;
    }
    /** O(1)space & O(n)runTime **/
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer>integers= new ArrayList<>();
        for(Integer number: nums){
            if (number<0)number*=-1;
            int indexNumber= number-1;
            if(nums[indexNumber]<0)
                integers.add(number);
            nums[indexNumber]*=-1;
        }
        return integers;
    }
}

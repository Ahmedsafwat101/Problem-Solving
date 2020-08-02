package com.AhmedSafwat;
/*
* 69. Sqrt(x)
* https://leetcode.com/problems/sqrtx/
*  */
public class Sqrt {

    public int mySqrt(int x) {
        return (int) Math.pow(2,0.5*(Math.log(x)/Math.log(2)));
    }

    /*
     *   Mathematical Explanation
     *   n(1/2) = d
     *   apply log2 on both sides
     *   log2(n(1/2)) = log2(d)
     *   log2(d) = 1/2 * log2(n)
     *   d = 2(1/2 * log2(n))
     *   d = pow(2, 0.5*log2(n))
     */
}

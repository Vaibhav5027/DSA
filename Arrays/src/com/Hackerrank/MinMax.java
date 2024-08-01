package com.Hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.*;

public class MinMax {
    public static void minMax(List<Integer> nums) {
//        int n = nums.size() - 1;
//        int max = 0;
//        int min = 0;
//        Collections.sort(nums);
//        
//        for (int i = 0; i <= n; i++) {
//            if (i > 0) {
//                max += nums.get(i);
//            }
//            if (i < n) {
//                min += nums.get(i);
//            }
//        }
//        
//        System.out.println(min + " " + max);
        int totalSum = nums.stream().mapToInt(Integer::intValue).sum();

        // Minimum sum is the sum of all elements except the largest
        int minSum = totalSum - nums.get(nums.size() - 1);

        // Maximum sum is the sum of all elements except the smallest
        int maxSum = totalSum - nums.get(0);

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        minMax(nums1);
    }
}


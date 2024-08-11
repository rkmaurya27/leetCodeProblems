package com.test.OntheGo.leetcode;

import java.util.HashMap;

class ArrayTest {
    public static int[] twoSum(int[] nums, int target) {
        int[] result;
        HashMap<Integer, Integer> hm=new HashMap<>();
        int complement;
        for(int i=0; i < nums.length; i++){
            int getNum = nums[i];
            complement = target - getNum;
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement), i};
            }
            hm.put(getNum, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[]atf){
        int[] nums = {2, 7, 11, 15, 8, 1};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
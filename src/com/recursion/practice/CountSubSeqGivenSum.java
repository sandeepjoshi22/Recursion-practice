package com.recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeqGivenSum {

    public static int count=0;
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int targetSum = 5;
        List<Integer> list = new ArrayList<>();
        helper(arr,list,targetSum,0);
        System.out.println(count);
    }

    private static void helper(int[] arr,List<Integer> list,int targetSum,int index){
        //base condition 1
        if(targetSum==0){
            count++;
            return;
        }
        //base condition 2
        if(index >= arr.length)
            return;

        // take current el
        list.add(arr[index]);
        helper(arr,list,targetSum-arr[index],index+1);

        //leave current el
        list.remove(list.size()-1);
        helper(arr, list, targetSum, index+1);
    }
}

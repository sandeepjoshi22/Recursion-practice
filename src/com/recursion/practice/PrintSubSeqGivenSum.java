package com.recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSeqGivenSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2};
        int targetSum = 5;
        List<Integer> list = new ArrayList<>();
        helper(arr,list,targetSum,0);
    }

    private static void helper(int[] arr,List<Integer> list,int targetSum,int index){
        //base condition 1
        if(targetSum==0){
            System.out.println(list);
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

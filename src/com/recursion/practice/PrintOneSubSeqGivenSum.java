package com.recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintOneSubSeqGivenSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2};
        int targetSum = 5;
        List<Integer> list = new ArrayList<>();
        helper(arr,list,targetSum,0);
    }

    private static boolean helper(int[] arr, List<Integer> list, int targetSum, int index) {
        if(targetSum == 0){
            System.out.println(list);
            return true;
        }

        if(index>=arr.length)
            return false;

        list.add(arr[index]);
        if(helper(arr, list, targetSum-arr[index], index+1)){
            return true;
        }
        list.remove(list.size()-1);
        return helper(arr, list, targetSum, index + 1);
    }
}

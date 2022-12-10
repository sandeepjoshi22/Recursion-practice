package com.recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        helper(arr,list,0);
    }

    private static void helper(int[] arr, List<Integer> list, int index) {
        //base condition
        if(index >= arr.length){
            System.out.println(list);
            return;
        }

        //take the current el
        list.add(arr[index]);
        helper(arr, list, index+1);

        //leave out the current index
        list.remove(list.size()-1);
        helper(arr, list, index+1);
    }
}

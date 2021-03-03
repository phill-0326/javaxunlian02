package com.company.moring;

/**
 * 数组反转的另一种方法，倒序赋值法
 * author：phil
 */
public class fanzhuan02 {
    public static void main(String[] args) {
        int [] arr1 = {11,22,33,44,55,66,77,88,99};
        int [] arr2 = new int[arr1.length];
        int len = arr1.length;
        for (int i = 0; i < len; i++) {
            arr2[i] = arr1[len-i-1];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr2[i]+"\t");
        }
    }

}

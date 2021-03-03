package com.company.moring;

/**
 * 将数组中的各个位置进行反转得到新的数组输出。
 * author：phil
 */
public class fanzhuan01 {
    public static void main(String[] args) {
        int [] arr ={12,34,55,66,77,88,99,90,11,234};
        int temp =0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - 1 -i];
            arr[len - 1- i] = temp;
        }
        System.out.println("====反转后的数组====");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}

package com.company.moring;

import java.util.Scanner;

/**
 * 动态为数组扩容，添加一个新的整数元素.
 * author：phil
 */

public class arrayAdd {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {

            int[] arrNew = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];

            }
            System.out.println("请输入一个整数：");
            int addNum = myScaner.nextInt();
            arrNew[arrNew.length-1] = addNum;
            arr = arrNew;//让arr指向arrNew
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }
            System.out.println();//换行处理
            System.out.println("是否继续添加？y/n");
            char c1 = myScaner.next().charAt(0);
            if (c1 == 'n'){
                break;
            }
        }while(true);
        System.out.println("您已经退出添加了！！！！");

    }
}

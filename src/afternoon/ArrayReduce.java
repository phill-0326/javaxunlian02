package afternoon;
/**
 * 数组缩减，提示用户是否开始缩减当缩减到只有一个的时候告诉用户不能再缩减了
 * author：phil
 */

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScaner =  new Scanner(System.in);
        int [] arr = {1,2,3,4,5,7,8,222,33,45,6,9};
        int count = arr.length;
        do {
            int [] arrNew = new int[arr.length-1];//长度为4
            for (int i = arr.length -1; i >0; i--) {
                arrNew[arr.length-1-i]= arr[arr.length-1-i];
            }
            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("是否继续缩小？ y/n?");
            char c1 = myScaner.next().charAt(0);
            if (c1 == 'n'){
                System.out.println("正在退出缩减请稍后。。。。");
                break;
            }
           count--;
            if (count == 1){
                System.out.println("已经不能再缩减了，只剩下最后一个了！！！！");
                break;
            }
        }while(true);
    }
}

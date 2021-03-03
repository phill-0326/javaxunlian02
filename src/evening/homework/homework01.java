package evening.homework;

/**
 * 已知有一个升序的数组，要求插入一个元素，该数组顺序依然是升序
 * author: phil
 */

public class homework01 {
    public static void main(String[] args) {
        //想数组添加元素23
        int temp =0;
        int [] arr = {10,12,45,90};
        int [] arrNew = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
             arrNew[i]=arr[i];
         }
         arrNew[arrNew.length-1]=23;
         arr=arrNew;
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+"\t");
         }
        System.out.println();
         //冒泡排序 升序
        int len = arr.length;
        for (int i = len-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}

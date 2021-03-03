package afternoon;

/**
 * 冒泡排序
 * author：phil
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {99,78,23,56,76,12,99,65,88,120};
        int temp =0;
        int len = arr.length;
        for (int i = len-1; i >0; i--) {
            for (int j = 0; j < len-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for (int i1 = 0; i1 < len; i1++) {
                System.out.print(+arr[i1]+"\t ");
            }
        }

    }
}

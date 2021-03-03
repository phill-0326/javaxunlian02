package afternoon;

/**
 * 遍历一个二维数组，并且将每一个数求和输出
 * author：phil
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int sum = 0;
        int [][] arry = {{4,6},{1,4,5,7},{-2}};
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                sum += arry[i][j];
                System.out.print(arry[i][j]+"\t");

            }
            System.out.println();
        }
       System.out.println("============");
        System.out.println("总和是："+ sum);
    }
}

package afternoon;

/**
 * 输出10行的杨辉三角、
 * author：phil
 */
public class yanghuisanjiao {
    public static void main(String[] args) {

        int [][] yanghui = new int[10][] ;

        for (int i = 0; i < yanghui.length; i++) {
            //给每个一维数组（行）开空间
            yanghui[i] = new int[i+1];
            //给每一个数组（行）赋值
            for (int j = 0; j < yanghui[i].length; j++) {
                //每一行的第一和最后一个元素都是1
               if(j == 0 || j == yanghui[i].length -1){
                   yanghui [i][j] = 1;
               }else {
                   yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
               }
            }

        }
        //输出杨辉三角
        for (int i = 0; i < yanghui.length; i++) {
            //对有每一行的各个元素进行遍历输出
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

package evening.homework;

/**
 * 随机生成10个整数（1-100）保存到数组中，并倒序排序(顺序反过来排了)以及求平均值、最大值、以及最大值的下标
 * 并且查找数组中是否存在8
 * author：phil
 */
public class homework02 {
    public static void main(String[] args) {
        int count =0;
        double sum = 0;
        double avg = 0;
        int len = 8;
        int[] arr = new int[len];

        //随机生成10个数并且添加到数组中
        while(true){
            for (int i = 0; i < len; i++) {
                int num = (int)(Math.random()*101);//在100以内随机生成10个整数
                arr[i]= num;
            }
            count++;
           // System.out.print(num+"\t");
           if (count == len){
               break;
           }
        }
       // System.out.println("生成的随机数组如下：");
        for (int i = 0; i < len; i++) {
          // System.out.print(arr[i] +"\t");
            sum += arr[i];
           /* if(arr[i]==8){
                System.out.println("该数组存在8");
            }*/
        }

        avg = sum/len;
       // System.out.println("平均值为："+avg);

        //倒序排列
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+"\t");
        }

        //最大值，和下标以及平均值
        int max = arr[0];
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("\nmax  "+max+"  maxIndex = "+ maxIndex +"  平均值为："+ avg);

        //数组中是否有8
        int fundNum = 8;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (fundNum == arr[i]){
                System.out.println("该数组中已经找到"+fundNum);
                index = i;
                break;
            }

        }
        if (index == -1){
            System.out.println("没有找到这个数" + fundNum);
        }


       /* for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < len-1; j++) {
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("数组倒序排序：");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("最大值为："+arr[0]+"下标为："+index);*/
    }
}

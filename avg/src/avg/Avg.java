//输入数字计算平均值，并且输出大于平均值的数
package avg;

import java.util.Scanner;

public class Avg {
	public static void main(String[]args) {
		System.out.println("请输入数字：");
		Scanner in = new Scanner(System.in);
		float avg ;
		int[] number=new int[100];
		int sum= 0;
		int count =0;
		int a= in.nextInt();
		while(a!=-1)
		{
			number[count]=a;
			count=count+1;
			sum =sum+a;
			a= in.nextInt();
		}	
//		do {
//			a= in.nextInt();
//				if(a!=-1) 
//				{
//					count=count+1;
//					sum =sum+a;
//				}
//			}while(a!=-1);
			
		if (count > 0) {
            avg = (float) sum / count;
            for (int i = 0; i < count; i++) {
                if (number[i] > avg) {
                    System.out.println(number[i]);
                }
            }
            System.out.println("平均值为：" + avg);
        }
    }
}

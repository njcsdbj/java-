package caishu;

import java.util.Scanner;

public class Caishu {
	public static void main(String[] args)
	{
		System.out.println("请输入数字0-100的：");
		Scanner in = new Scanner(System.in);
		int number = (int) (Math.random()*100+1);
		int a;
		int count=0;
		do
		{
			a=in.nextInt();
			count =count +1;
			if(a>number)
			{
				System.out.println("偏大");
			}
			else if(a<number)
			{
				System.out.println("偏小");
			}
		}while (a!=number);
		System.out.println("恭喜你猜"+count+"次回答正确");
		
	}

}
//package caishu;
//
//import java.util.Scanner;
//
//public class Caishu {
//    public static void main(String[] args) {
//        System.out.println("游戏开始！");
//        int start = 1;
//        int end = 100;
//        int number = (int)(Math.random() * 100 + 1);
//        int count = 0;
//        
//        while (true) {
//            int mid = (start + end) / 2;
//            System.out.println("电脑猜测：" + mid);
//            count++;
//            
//            if (mid == number) {
//                System.out.println("电脑猜对了，数字是：" + mid);
//                System.out.println("猜测次数：" + count);
//                break;
//            } else if (mid > number) {
//                System.out.println("偏大");
//                end = mid - 1;
//            } else {
//                System.out.println("偏小");
//                start = mid + 1;
//            }
//        }
//        System.out.println("游戏结束！");
//    }
//}


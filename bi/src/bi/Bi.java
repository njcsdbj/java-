package bi;

import java.util.Scanner;

public class Bi {
	public static void main(String[] args) 
	{
	 Scanner in =new Scanner(System.in);
	System.out.println("请输入三个数字：");	
		        int num1 =in.nextInt() ;
		        int num2 = in.nextInt();
		        int num3 = in.nextInt();
		        
		        if(num1 >= num2 && num1 >= num3) {
		            System.out.println(num1 + "是最大的数");
		        } else if(num2 >= num1 && num2 >= num3) {
		            System.out.println(num2 + "是最大的数");
		        } else {
		            System.out.println(num3 + "是最大的数");
		        }
		    

	
	
	
	
	}
	}
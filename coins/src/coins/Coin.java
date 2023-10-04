package coins;
import java.util.HashMap;
import java.util.Scanner;
public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer,String>();
//hash的键是Integer value是 String	
	public Coin() {
		//设置hash的键与值
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dollar");
		coinnames.put(100, "dollar");
//		System.out.println(coinnames.keySet().size());//.keyset查看hash中有多少个键
//		System.out.println(coinnames);//输出hash表这个集合
		//遍历hash表
//		for(Integer k:coinnames.keySet())//for-each循环遍历hash表中的key
//		{
//			String s =coinnames.get(k);//通过查找到的键匹配相印的值
//			System.out.println(s);
//			
//		}
	}
	public String getName(int amount) {
		if(coinnames.containsKey(amount))//检查输入的这个key是否在hash表中
			return coinnames.get(amount);	
		else
			return "not found";
	}
	public static void main(String[] args) {
		System.out.print("请输入面额的数值：");
		Scanner in =new Scanner(System.in);
		int amount=in.nextInt();
		Coin coin =new Coin();//创建一个coin的对象
		String name=coin.getName(amount);
		System.out.println(name);
	}

}

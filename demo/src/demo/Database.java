package demo;

import java.util.ArrayList;

public class Database {
//	private	 ArrayList<CD> listCD =new ArrayList<CD>();//定义一个arrylist的容器
//	private	 ArrayList<DVD> listDVD =new ArrayList<DVD>();
	private	 ArrayList<Item> listItem =new ArrayList<Item>();
//	public void  add(CD cd) {
//		listCD.add(cd);
//	}//实现添加cd的信息
//	public void  add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	public void add(Item item) {
		listItem.add(item);
	}
	public void list() {
//		for(CD cd:listCD)
//		{
//			cd.print();
//		}//使用for-each 循环打印cd的信息
//		for(DVD dvd:listDVD) 
//		{
//			dvd.print();
//					
//		}
		for(Item item:listItem) {
			item.print();
		}
		
	}
	public static void main(String[] args) {
		Database db=new Database();
		db.add(new CD("ABC","ABC",40,30,"..."));
		db.add(new CD("FGC","FGC",40,30,"..."));
		
		db.add(new DVD("GGG","GGG",30,"..."));
		db.list();
	}

}

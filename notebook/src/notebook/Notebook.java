package notebook;
import java.util.ArrayList;
import java.util.HashSet;
public class Notebook {
	private ArrayList<String> notes =new ArrayList<String>();
	/*
	 容器类有两个类型
		Arraaylist容器类型和<>元素类型
	*/
	//以下是程序的设计接口设计
	public void add(String s) 
	{
		notes.add(s);
		
	}//添加字符串
	public void add(String s,int loaction) {
		notes.add(loaction, s);
	}//添加一个指位置的字符串
	public int getSize() {
		return notes.size();
	}
	public String getNotebook(int index) {
		return notes.get(index);
	}//查询字符串
	public void removeNote(int index) {
		 notes.remove(index);
	}//移除某一个字符串,index为索引号
	public String[] list(){
		String[] a= new String[notes.size()];
//		for(int i=0;i<notes.size();i++) {
//			a[i]=notes.get(i);
//		}
		//对象数组中的每一个元素都是对象的管理者而非对象本身。
		notes.toArray(a);
		return a;
	}//返回所有的字符串
	public static void main(String[] args) {
//		String[] a=new String[2];
//		a[0]="first";
//		a[1]="second";
//		Notebook nb=new Notebook();
//		nb.add("first");//添加一个first的字符串
//		nb.add("seconed");
//		nb.add("third", 1);
//		System.out.println(nb.getSize());//打印记事本里有几个字符串
//		System.out.println(nb.getNotebook(1));
//		nb.removeNote(1);//移除索引为1的字符串，并且返回这个字符串
//		String[] a1 =nb.list();//遍历整个数组
//		for(String s:a1) {
//			System.out.println(s);
//		}
		//对象数组的for-each
		ArrayList<String> a= new ArrayList<String>();
		a.add("first");
		a.add("second");
		a.add("first");
		System.out.println(a);
		System.out.println("--------");
		for(String s:a) {
			System.out.println(s);
		}
	System.out.println("----------");
		HashSet<String> m =new HashSet<String>();//set类似数学中的集合，不重复原则。
		m.add("first");
		m.add("second");
		m.add("first");

	 	for(String k:m) 
	 	{
	 		System.out.println(k);
	 		
	 	}
	 	System.out.println("--------");
	 	System.out.println(m);
	}

}

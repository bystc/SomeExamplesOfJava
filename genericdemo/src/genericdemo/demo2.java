package genericdemo;
import java.util.*;
public class demo2{
	public static void main(String[] args){
		TreeSet<String>ts=new TreeSet<String>(new Demo2Comparetor());
		ts.add("avac");
		ts.add("bvac");
		ts.add("avaccc");
		ts.add("xcsd");
		ts.add("g");
		Iterator<String>it=ts.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
	}
}
//按字符长度倒序排序
class Demo2Comparetor implements Comparator<String>{
	public int compare(String o1,String o2){
		int num=new Integer(o2.length()).compareTo(new Integer(o1.length()));
		if(num==0){
			return o2.compareTo(o1);
		}
		return num;
	}
}
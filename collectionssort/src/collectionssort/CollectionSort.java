package collectionssort;
import java.util.*;
public class CollectionSort {
	public static void main(String[] args){
		sortDemo();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void sortDemo(){
		List<String>list=new ArrayList<String>();
		list.add("abcd");
		list.add("a");
		list.add("abc");
		list.add("ccdcd");
		list.add("aa");
		list.add("bb");
		
		sop(list);
		
		Collections.sort(list,new StrLenComparetor());
		
		sop(list);
		
		Collections.reverse(list);//反转集合里的元素
		
		sop(list);
	}
}

class StrLenComparetor implements Comparator<String>{
	public int compare(String s1,String s2){
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
	
	
}

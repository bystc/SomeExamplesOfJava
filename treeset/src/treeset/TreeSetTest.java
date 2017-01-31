package treeset;

import java.util.*;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new StrLenComparator());
		ts.add("abc");
		ts.add("bbc");
		ts.add("cbc");
		ts.add("abbcb");
		ts.add("dabc");
		ts.add("a");
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
class StrLenComparator implements Comparator{
	public int compare(Object o1,Object o2){
		String  s1=(String)o1;
		String  s2=(String)o2;
//		if(s1.length()>s2.length())
//			return 1;
//		if(s1.length()==s2.length())
//			return 0;
//		return -1;
		
		int num=new Integer(s1.length()).compareTo(new Integer(s2.length()));
		
		if(num==0)
			return s1.compareTo(s2);
		return num;
	}
}
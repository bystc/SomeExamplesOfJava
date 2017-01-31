package genericdemo;
import java.util.*;
public class demo3 {
	public static void main(String[] args){
		ArrayList<String>al=new ArrayList<String>();
		al.add("ava");
		al.add("baabab");
		al.add("c");
		
		ArrayList<Integer>all=new ArrayList<Integer>();
		all.add(111);
		all.add(2323);
		all.add(3);
		
		printcoll(al);
		printcoll(all);
		
	}
	
	public static void printcoll(ArrayList<?>al){
		Iterator<?> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}
}

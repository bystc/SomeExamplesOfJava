
package genericdemo;
import java.util.*;


public class GenericDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("aba");
		al.add("cad11");
		al.add("dwadwad");
		al.add("1212");
		//al.add(4);
		System.out.println(al.size());
		//al.add(new Integer(4));
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str+":"+str.length());
		}
	}
}

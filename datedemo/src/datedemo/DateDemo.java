package datedemo;
import java.util.*;
import java.text.*;
public class DateDemo {
	public static void main(String[] args){
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日E HH:mm:ss");
		String time=sdf.format(d);
		
		System.out.println(time);
	}
}

package systemdemo;
import java.util.*;
public class SystemDemo {
	public static void main(String[] args){
		
		
		Properties prop=System.getProperties();
		
		
		System.setProperty("mykey","myvalues");
		
		String value=System.getProperty("os.name");
		
		System.out.println("value="+value);
		
		/*
		for(Object obj:prop.keySet()){
			String value=(String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}
		*/
	}
}

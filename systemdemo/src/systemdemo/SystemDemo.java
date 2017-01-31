package systemdemo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class SystemDemo {
	public static void main(String[] args) throws IOException{
		
		
		Properties prop=System.getProperties();
		
		
		System.setProperty("mykey","myvalues");
		
		String value=System.getProperty("os.name");
		
		System.out.println("value="+value);
		
		Properties prop1=System.getProperties();
		prop.list(new PrintStream("System.txt"));
		
		/*
		for(Object obj:prop.keySet()){
			String value=(String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}
		*/
	}
}

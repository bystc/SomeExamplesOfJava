package propertiesdemo;
import java.io.*;
import java.util.*;
/*
 * Properties是hashtable的子类
 * 也就是说具备Map集合的特点，而且它里面存储的键值对都是字符串
 * 是集合中和IO技术相结合的集合容器
 * 该对象的特点，可以用于键值对形式的
 * 配置文件
 */
public class PropertiesDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		method1();
		loadDemo();
	}
	//想要将info.txt中键值数据存到集合中进行操作
	//用一个流和Info.txt文件关联
	//读取一行数据，将该行数据用“=”切割、
	//将等号左边作为键，右边作为值，存入到properties集合中即可
	public static void loadDemo()throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("info.txt");
		prop.load(fis);
		prop.setProperty("wangwu","39");
		FileOutputStream fos=new FileOutputStream("info.txt");
		prop.store(fos,"haha");
		//prop.setProperty("wangwu","38");
		//System.out.println(prop);
		prop.list(System.out);//列出集合中的目录
		fos.close();
		fis.close();
	}
	
	
	
	public static void method1() throws IOException{
		BufferedReader bufr=new BufferedReader(new FileReader("info.txt"));
		String line=null;
		Properties prop=new Properties();
		while((line=bufr.readLine())!=null){
			String[]arr=line.split("=");
			
			//System.out.println(arr[0]+"..."+arr[1]);
			prop.setProperty(arr[0], arr[1]);
		}
		bufr.close();
		
		
		System.out.println(prop);
	}
	public static void setAndGet(){
		Properties prop=new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "39");
		System.out.println(prop);
		prop.setProperty("lisi", "100");
		String value=prop.getProperty("lisi");
		System.out.println(value);
		Set<String>names=prop.stringPropertyNames();
		for(String s:names){
			System.out.println((s)+":"+prop.getProperty(s));
		}
	}

}

package filedemo;
import java.io.*;

public class FileDemo2 {
	public static void main(String[] args){
		//listRootsDemo();//列出系统中有效盘符（列出可用的文件系统根）
		//istDemo();
		File dir=new File("c:\\");
		File[]files=dir.listFiles();
		for(File f:files){
			System.out.println(f.getName()+"::"+f.length());
		}
	}
	public static void listDemo(){
		File f=new File("d:\\");
		
		String[]names=f.list();
		for(String name:names){
			System.out.println(name);
		}
	}
	public static void listRootsDemo(){
		File[]files=File.listRoots();
		
		for(File f:files){
			System.out.println(f);
		}
	}
}

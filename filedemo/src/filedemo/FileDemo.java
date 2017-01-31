package filedemo;
import java.io.*;
/*
 * 1.创建
 * boolean createNewFile();在指定位置创建文件，如果该文件已经存在，则不创建，返回false
 * 							和输出流不一样，输出流对象一建立创建文件，而且文件已经存在，会覆盖
 * boolean mkdir();创建文件夹，
 * boolean mkdirs();创建多级文件夹，
 * 
 * 
 * 2.删除
 * boolean delete();删除失败返回false
 * void deleteOnExit();在程序退出时删除指定文件
 * 
 * 3.判断
 * boolean canExecute();判断是否可以执行
 * boolean exists();文件是否存在
 * isFile();
 * isDirectory();
 * 4.获取信息
 * getName()
 * getPath()
 * getAbsolutePath()
 * lastModified()
 * length()
 * renameTo()剪切
 * 
 */
public class FileDemo {
	public static void main(String[] args) throws IOException{
		//consMethod();
		method5();
	}
	
	public static void method5(){
		File f1=new File("D:\\1.java");
		File f2=new File("D:\\1.java");
		sop("rename:"+f1.renameTo(f2));
		
		
		
	}
	
	public static void method4(){
		File f=new File("SystemDemo.java");
		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent());//该方法返回的是绝对路径的父目录，如果获取的是相对路径，返回null
		//如果相对路径中有上一层目录那么该目录返回结果
		sop(f.length());
	}
	
	
	
	public static void method3(){
		File f=new File("C:\\Users\\huang\\OneDrive\\Documents\\Java\\filedemo\\SystemDemo.java");
		//记住在判断文件对象是否是文件或者目录时，必须要先判断该文件对象封装的内容是否存在
		//通过exists判断
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());
		sop(f.isAbsolute());
	}
	public static void method2()throws IOException{
		File f=new File("");
		
		sop("exists:"+f.exists());
		//sop("execute:"+f.canExecute());
		
		//创建文件夹
		File dir=new File("abc\\kkk\\eqe\\eqe");
		
		sop("mkdirs:"+dir.mkdirs());//只能创建一级目录
	}
	
	public static void method1() throws IOException{
		File f=new File("file.txt");
		//f.deleteOnExit();//在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
		//sop("create:"+f.createNewFile());
		//sop("delete:"+f.delete());
	}
	
	
	
	
	
	
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
	//创建file对象，
	public static void consMethod(){
		File f=new File("a.txt");
		
		File f1=new File("c:\\abc","b.txt");
		
		File d=new File("c:\\abc");
		File f2=new File(d,"c.txt");
		
		
		File f3=new File("c:"+File.separator+"abc"+File.separator+"zzz"+File.separator+"a.txt");
		sop("f:"+f);
		sop("f1:"+f1);
		sop("f2:"+f2);
		sop("f3:"+f3);
	}
}

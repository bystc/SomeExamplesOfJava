package randomaccessfile;
import java.io.*;

/*
 * 该类不算是IO体系中子类
 * 而是直接继承自Object
 * 但是它是IO包中成员，因为它具备读和写功能
 * 内部封装了一个数组，而且通过指针对数组的元素进行操作
 * 可以通过getFilePointer获取指针位置
 * 同时可以通过seek改变指针的位置
 * 
 * 其实完成读写的原理就是内部封装了字节输入流和输出流
 * 通过构造函数可以看出，该类只能操作文件
 * 而且操作文件还是模式
 * 
 * 
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//writeFile();
		readFile();
	}
	
	public static void readFile() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("ran.txt","r");
		raf.seek(4);
		byte[]buf=new byte[10];
		raf.read(buf);
		
		
		String name=new String(buf);
		int age=raf.readInt();
		System.out.println("name="+name);
		System.out.println("age="+age);
		raf.close();
	}
	
	public static void writeFile() throws IOException{
		RandomAccessFile rad=new RandomAccessFile("ran.txt","rw");
		rad.write("李四".getBytes());
		rad.writeInt(17);
		rad.write("王五".getBytes());
		rad.writeInt(99);
		rad.close();
				
	}

}

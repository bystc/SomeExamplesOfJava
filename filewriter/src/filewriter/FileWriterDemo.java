package filewriter;
import java.io.*;
public class FileWriterDemo {
	public static void main(String[] args)throws IOException{
		//创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件
		//而且该文件会被创建在指定的目录下，如果该目录已有同名文件，将会被覆盖
		//其实该步就是在明确数据要存放的目的地
		FileWriter fw=new FileWriter("demo.txt");
		
		//调用write方法，将字符串写入进流中。
		fw.write("abcde");
		
		//刷新流对象中的缓冲中的数据
		//将数据刷到目的地中。
		fw.flush();
//		
//		fw.write("dwadawda");
//		fw.flush();
		//关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据
		//将数据刷到目的地中，
		//和flush区别：Flush刷新后，流可以继续使用，close刷新后流会关闭
		fw.close();
		fw.write("dawdw");
		
	}
}

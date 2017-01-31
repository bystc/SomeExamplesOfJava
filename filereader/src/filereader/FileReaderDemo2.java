package filereader;
import java.io.*;
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("demo.txt");
		
		char[]buf=new char[1024];
		
//		int num=fr.read(buf);
//		System.out.println("num="+num+"..."+new String(buf));
//		
//		int num1=fr.read(buf);
//		System.out.println("num1="+num1+"..."+new String(buf));
//		
//		int num2=fr.read(buf);
//		System.out.println("num2="+num2+"..."+new String(buf,0,3));
//		
//		int num3=fr.read(buf);
//		System.out.println("num3="+num3+"..."+new String(buf));
		
		int num=0;
		while((num=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,num));
		}
		fr.close();
	}
}

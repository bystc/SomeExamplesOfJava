package splitdemo;
import java.io.*;
import java.util.*;
public class SplitDemo {
	public static void main(String[] args)throws IOException{
		splitFile();
	}
	public static void splitFile()throws IOException{
		FileInputStream fis=new FileInputStream("d:\\1.bmp");
		FileOutputStream fos=null;
		byte[]buf=new byte[1024];
		int len=0;
		int count=1;
		while((len=fis.read(buf))!=-1){
			fos=new FileOutputStream("d:\\splitfile\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
		}
		
		if(fos!=null)
			fos.close();
		fis.close();
	}
}

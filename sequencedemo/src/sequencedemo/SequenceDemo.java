package sequencedemo;
import java.io.*;
import java.util.*;
public class SequenceDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(new FileInputStream("d:\\1.txt"));
		v.add(new FileInputStream("d:\\2.txt"));
		v.add(new FileInputStream("d:\\3.txt"));
		
		Enumeration<FileInputStream>en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);
		
		FileOutputStream fos=new FileOutputStream("d:\\4.txt");
		byte[]buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
			
		}
		fos.close();
		sis.close();
	}

}

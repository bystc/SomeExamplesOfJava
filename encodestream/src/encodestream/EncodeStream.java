package encodestream;
import java.io.*;
public class EncodeStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//writeText();
		readText();
	}
	public static void readText()throws IOException{
		InputStreamReader isr=new InputStreamReader(new FileInputStream("gbk.txt"),"utf-8");
		char[]buf=new char[10];
		int len=isr.read(buf);
		String str=new String(buf,0,len);
		System.out.println(str);
		isr.close();
	}
	public static void writeText()throws IOException{
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		osw.write("你好");
		osw.close();
	}

}

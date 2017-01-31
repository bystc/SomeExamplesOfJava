package encodestream;
import java.io.*;
import java.util.Arrays;
public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s="你好";
		
		byte[]b1=s.getBytes("gbk");
		System.out.println(Arrays.toString(b1));
		String s1=new String(b1,"iso8859-1");
		System.out.println(s1);
		
		byte[]b2=s1.getBytes("iso8859-1");
		System.out.println(Arrays.toString(b1));
		String s2=new String(b2,"gbk");
		System.out.println(s2);
		
		
		
	}
}

package bytearrayinputstream;
/*
 * 用于操作字节数据的流对象
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
public class ByteArrayInputStream {
	public static void main(String[] args){
		//数据源
		ByteArrayInputStream bis=new ByteArrayInputStream("ABCDEF".getBytes());
		//数据目的
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		int by=0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		System.out.println(bos.size());
		
	}
}

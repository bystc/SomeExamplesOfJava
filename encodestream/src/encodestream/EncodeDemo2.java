package encodestream;
import java.io.*;
public class EncodeDemo2 {

	public static void main(String[] args) throws IOException {
		String s="联通";
		byte[] by=s.getBytes("gbk");
		for(byte b:by){
			System.out.println(Integer.toBinaryString(b&255));
			
		}

	}

}

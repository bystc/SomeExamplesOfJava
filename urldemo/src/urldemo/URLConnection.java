package urldemo;
import java.io.*;
import java.net.*;

public class URLConnection {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://192.168.37.1:8080/myweb/demo.html");
		URLConnection conn = url.openConnection();
		
		System.out.println(conn);
		InputStream in=conn.getInputStream();
		byte[]buf=new byte[1024];
		
		int len=in.read(buf);
		System.out.println(new String(buf,0,len));
		

	}

}

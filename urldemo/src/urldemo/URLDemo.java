package urldemo;
import java.net.*;
public class URLDemo {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://192.168.37.1/myweb/demo.html?:name=haha&&age=30");
		System.out.println("getProtocol() :"+url.getProtocol());
		System.out.println("getHost() :"+url.getHost());
		System.out.println("getPort() :"+url.getPort());
		System.out.println("getFile() :"+url.getFile());
		System.out.println("getPath() :"+url.getPath());
		System.out.println("getQuery() :"+url.getQuery());
		

	}

}

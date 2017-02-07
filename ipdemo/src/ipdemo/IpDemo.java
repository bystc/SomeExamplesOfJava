package ipdemo;
import java.net.*;

public class IpDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress i=InetAddress.getLocalHost();//主机名+地址
		System.out.println(i.toString());
//		System.out.println("address:"+i.getHostAddress());
//		System.out.println("hostname:"+i.getHostName());
		InetAddress ia=InetAddress.getByName("www.baidu.com");
	    System.out.println("address:"+ia.getHostAddress());
		System.out.println("hostname:"+ia.getHostName());
		
		
		

	}

}

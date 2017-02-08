package serverdemo;
import java.io.*;
import java.net.*;
/*
 * 1.
 * 客户端：浏览器
 * 服务端：自定义
 * 2.
 * 客户端：浏览器
 * 服务端：Tomcat服务器
 * 3.
 * 客户端：自定义
 * 服务端：Tomcat服务器
 * 
 * 
 * 
 * 
 */
class ServerDemo {

	public static void main(String[] args)throws Exception {
		ServerSocket ss=new ServerSocket(11000);
		Socket s=ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());
		
		InputStream in=s.getInputStream();
		byte[]buf=new byte[1024];
		int len=in.read(buf);
		System.out.println(new String(buf,0,len));
		
		
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println("hi,server");
		s.close();
		ss.close();

	}

}

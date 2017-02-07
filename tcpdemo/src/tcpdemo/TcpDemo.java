package tcpdemo;

import java.io.*;
import java.net.*;
/*
 * 1.Tcp分客户端和服务端
 * 2.客户端对应的对象是Socket
 * 通过查阅socket对象，发现在该对象建立时，就可以去连接指定主机
 * 因为tcp是面向连接的，所以在建立socket服务时，就要有服务端存在，并连接成功
 * 形成通路后，在该通道进行数据的传输
 *    步骤;
 *     1.创建socket对象，并指定要连接的主机和端口
 * 3.服务端对应的对象是ServerSocket
 * 
 * 
 * 
 */
class TcpClient{
	public static void main(String[] args) throws Exception{
		//创建客户端的socket服务，指定目的主机和端口
		Socket s=new Socket("192.168.37.1",10003);
		
		//为了发送数据，应该获取socket流中的输出流
		OutputStream out =s.getOutputStream();
		out.write("tcp i am coming!".getBytes());
		
		s.close();
	}
}


public class TcpDemo {

	public static void main(String[] args) {
		

	}

}

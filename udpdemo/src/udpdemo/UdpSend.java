package udpdemo;
import java.io.IOException;
import java.net.*;
/*
 * 需求：通过udp传输协议将一段文字数据发送出去，
 * 思路：
 * 1.建立udpsocket服务
 * 2.提供数据，并将数据封装到数据包中
 * 3.通过socket服务的发送功能将数据包发送出去
 * 4.关闭资源。
 * 
 */
public class UdpSend {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket();
		byte[]buf="udp i am coming!".getBytes();
		DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.37.1"),10000);
		ds.send(dp);
		ds.close();
	}
}
/*
 * 需求：定义一个应用程序，用于接收udp协议传输的数据并处理
 * 思路：
 * 1.定义udpsocket服务。通常会监听一个端口。其实就是给这个接收网络应用程序定义数字标识
 * 方便于明确哪些数据过来该应用程序可以处理
 * 
 * 2.定义一个数据包，因为要 存储接收到的字节数据，因为数据包对象中有更多功能可以提取字节数据中的不同数据信息
 * 3.通过socket服务的receive方法将收到的数据存入已定义好的数据包中
 * 4.通过数据包对象的特有功能，将这些不同的数据取出，打印在控制台上。
 * 5.关闭资源
 */
 class UdpReceive{
	public static void main(String[] args)throws Exception{ 
		DatagramSocket ds=new DatagramSocket(10000);
		byte[]buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		String ip=dp.getAddress().getHostAddress();		
		String data=new String(dp.getData(),0,dp.getLength());
		int port=dp.getPort();
		System.out.println(ip+"::"+data+"::"+port);
		ds.close();
	}
}

package udpdemo2;
import java.net.*;
import java.io.*;
public class UdpReceive2 {
	public static void main(String[] args)throws Exception {
		DatagramSocket ds=new DatagramSocket(10001);
		while(true)
		{
			byte[]buf=new byte[1024];
			
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String ip=dp.getAddress().getHostAddress();
			String data=new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+"::"+data);
		}
		
		
		

	}

}

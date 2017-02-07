package udpdemo2;
import java.io.*;
import java.net.*;
public class UdpSend2 {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds=new DatagramSocket();
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null){
			if("88".equals(line))
				break;
			byte[]buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.37.1"),10001);
			ds.send(dp);
		}
		ds.close();
	}
}

package uploadtext;
import java.net.*;
import java.io.*;

class TextClient {

	public static void main(String[] args) throws Exception {
		Socket s=new Socket("192.168.37.1",10006);
		BufferedReader bufr=new BufferedReader(new FileReader("IpDemo.java"));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		long time=System.currentTimeMillis();
		//out.println(time);
		dos.writeLong(time);
		
		String line=null;
		while((line=bufr.readLine())!=null){
			out.println(line);
		}
		
		s.shutdownInput();//关闭客户端的输出流，相当于给流中加入一个结束标记-1
		dos.writeLong(time);
		out.println();
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=bufIn.readLine();
		System.out.println(str);
		bufr.close();
		s.close();
	}

}
class TextServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(10006);
		Socket s=ss.accept();
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+".....connected");
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		long l=dis.readLong();
		
		
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out=new PrintWriter(new FileWriter("server.txt"),true);
		String line=null;
		while((line=bufIn.readLine())!=null){
//			if("over".equals(line))
//				break;
			out.println(line);
			
		}
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		pw.println("load successful!");
		out.close();
		s.close();
		ss.close();
		

	}

}

package uploadpic;
import java.net.*;
import java.io.*;

class PicClient {

	public static void main(String[] args) throws Exception{
		Socket s=new Socket("192.168.37.1",10007);
		FileInputStream fis=new FileInputStream("1.bmp");
		OutputStream out=s.getOutputStream();
		byte[]buf=new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1)
		{
			out.write(buf,0,len);
			
		}
		
		s.shutdownOutput();//告诉服务端数据已写完
		
		InputStream in=s.getInputStream();
		byte[]bufIn=new byte[1024];
		int num=in.read(bufIn);
		System.out.println(new String(bufIn,0,num));
		fis.close();
		s.close();
		
		

	}

}
 class PicServer {

		public static void main(String[] args)throws Exception {
			ServerSocket ss=new ServerSocket(10007);
			Socket s=ss.accept();
			InputStream in=s.getInputStream();
			FileOutputStream fos=new FileOutputStream("server.bmp");
			byte[]buf=new byte[1024];
			int len=0;
			while((len=in.read(buf))!=-1){
				fos.write(buf,0,len);
				
			}
			OutputStream out=s.getOutputStream();
			out.write("load successful".getBytes());
			fos.close();
			s.close();
			ss.close();
			
		}

	}

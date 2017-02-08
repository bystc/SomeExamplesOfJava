package uploadpic;
import java.net.*;
import java.io.*;

class PicClient {

	public static void main(String[] args) throws Exception{
		if(args.length!=1)
		{
			System.out.println("Please choose a .jpg picture");
			return;
		}
		File file=new File(args[0]);
		if(!(file.exists()&&file.isFile()))
		{
			System.out.println("The file has problems!");
			return;
		}
		if((!file.getName().endsWith(".jpg")))
		{
			System.out.println("The Picture has errors!");
			return;
		}
		if(file.length()>1024*1024*5)
		{
			System.out.println("The file is too big");
			return;
		}
		
		Socket s=new Socket("192.168.37.1",10007);
		FileInputStream fis=new FileInputStream(file);
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
/*
 * 这个服务端有个局限性，当A客户端连接上以后，被服务端获取到，服务端执行具体流程
 * 这时B客户端连接，只有等待
 * 因为服务端还没有处理完A客户端的请求，还没有循环回来执行下次accept方法，所以暂时获取不到B客户端对象
 * 那么为了可以让多个客户端同时并发访问服务端，服务端最好将每个客户端封装到一个单独的线程中，这样就可以同时
 * 处理多个客户端请求
 * 
 * 如何定义线程呢？
 * 只要明确了每个客户端要在服务端执行的代码即可，
 * 将代码加载到run方法中
 * 
 * 
 * 
 */


class PicThread implements Runnable{
	private Socket s;
	PicThread(Socket s)
	{
		this.s=s;
	}
	public void run(){
		int count=1;
		String ip=s.getInetAddress().getHostAddress();
		try{
			
			System.out.println(ip+"......connected");
			InputStream in=s.getInputStream();
			
			File file=new File(ip+"("+(count)+")"+".jpg");
			
			while(file.exists())			
				file=new File(ip+"("+(count++)+")"+".jpg");
			
			
			
			FileOutputStream fos=new FileOutputStream("file");
			byte[]buf=new byte[1024];
			int len=0;
			while((len=in.read(buf))!=-1){
				fos.write(buf,0,len);
				
			}
			OutputStream out=s.getOutputStream();
			out.write("load successful".getBytes());
			fos.close();
			s.close();
		}catch(Exception e){
			throw new RuntimeException(ip+"upload fail");
		}
	}
}
 class PicServer {

		public static void main(String[] args)throws Exception {
			ServerSocket ss=new ServerSocket(10007);
			
			while(true){
				Socket s=ss.accept();
				new Thread(new PicThread(s)).start();
			}
			//ss.close();
			
		}

	}

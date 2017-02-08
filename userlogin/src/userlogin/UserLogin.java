package userlogin;
import java.net.*;
import java.io.*;
/*
 * 客户端通过键盘录入用户名
 * 服务端对这个用户名进行校验
 * 
 * 如果该用户名存在，在服务端显示xxx已登录
 * 并在客户端显示xxx欢迎光临
 * 
 * 如果该用户不存在，在服务端显示xxx尝试登录
 * 并在客户端显示xxx该用户不存在
 * 最多就登录三次
 * 
 * 
 * 
 * 
 */
class LoginClient {

	public static void main(String[] args) throws Exception {
	
		Socket s=new Socket("192.168.37.1",10008);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		for(int x=0;x<3;x++)
		{
			String line =bufr.readLine();
			if(line==null)
				break;
			out.println(line);
			
			String info=bufIn.readLine();
		
			System.out.println("info: "+info);
			if(info.contains("welcome"))
				break;
		}
		bufr.close();
		s.close();
	}

}
class UserThread implements Runnable{
	private Socket s;
	UserThread(Socket s)
	{
		this.s=s;
	}
	
	public void run()
	{
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"......connected");
		try{
			for(int x=0;x<3;x++)
			{
				BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String name=bufIn.readLine();
				if(name==null)
				{
					break;
				}
				BufferedReader bufr=new BufferedReader(new BufferedReader(new FileReader("user.txt")));
				
				PrintWriter out=new PrintWriter(s.getOutputStream(),true);
				
				String line=null;
				boolean flag=false;
				
				while((line=bufr.readLine())!=null)
				{
					if(line.equals(name))
					{
						flag=true;
						break;
					}
						
				}
				if(flag)
				{
					System.out.println(name+",logined");
					out.println(name+",welcome");
					break;
				}
				else
				{
					System.out.println(name+",try to login");
					out.println(name+",username not exists");
				}
			}
			s.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException(ip+"fail");
		}
	}
}

class LoginServer {

	public static void main(String[] args)throws Exception {
		ServerSocket ss=new ServerSocket(10008);
		while(true)
		{
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}

}

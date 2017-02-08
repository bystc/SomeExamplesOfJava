package serverdemo;
import java.io.*;
import java.net.*;
//192.168.37.1
//GET /myweb/demo.html HTTP/1.1
//Host: 192.168.37.1:11000
//Connection: keep-alive
//Cache-Control: max-age=0
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
//User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0
//Accept-Encoding: gzip,deflate,sdch
//Accept-Language: zh-CN,zh;q=0.8

public class MyIE {

	public static void main(String[] args)throws Exception {
		Socket s=new Socket("192.168.37.1",8080);
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println("GET /myweb/demo.html HTTP/1.1");
		out.println("Accept: */*");
		out.println("Accept-Language: zh-CN,zh;q=0.8");
		out.println("Host: 192.168.37.1:11000");
		out.println("Connection: closed");
		
		out.println();
		out.println();
		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		s.close();
		
		
	}

}

package regexdemo;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;

/*
 * 网页爬虫（蜘蛛）
 * 
 */
public class RegexTest2 {

	public static void main(String[] args)throws Exception {
		getMails1();
		

	}
	public static void getMails1()throws Exception{
		URL url=new URL("http://localhost:8080/myweb/demo.html");
		URLConnection conn=url.openConnection();
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line=null;
		
		String mailreg="\\w+@\\w+(\\.\\w+)+";
		Pattern p=Pattern.compile(mailreg);
		
		while((line=bufIn.readLine())!=null){
			Matcher m=p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}	
	}
	
	/*
	 * 
	 * 获取指定文档中的邮件地址
	 * 使用获取功能 Pattern Matcher
	 */
	public static void getMails()throws Exception{
		BufferedReader bufr=new BufferedReader(new FileReader("mail.txt"));
		String line=null;
		
		String mailreg="\\w+@\\w+(\\.\\w+)+";
		Pattern p=Pattern.compile(mailreg);
		
		while((line=bufr.readLine())!=null){
			Matcher m=p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}

}

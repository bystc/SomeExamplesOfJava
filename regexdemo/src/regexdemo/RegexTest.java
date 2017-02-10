package regexdemo;

import java.util.TreeSet;

/*
 * 1.如果只想知道该字符是否对是错，使用匹配
 * 2.想要将已有的字符串变成另一个字符串，替换
 * 3.想要按照自定的方式将字符串变成多个字符串，切割。获取规则以外的子串
 * 4.想要拿到符合需求的字符串字串，获取。获取符合规则的子串
 */
public class RegexTest {

	public static void main(String[] args) {
		String str="我我...我我哇哦...想学....";
		
		str=str.replaceAll("\\.+","");
		
		System.out.println(str);
		
		str=str.replaceAll("(.)\\1", "$1");
		
		System.out.println(str);
		
		
		
		
		
		
		String ip="192.68.1.254 102.15.01.445 10.110.10.10 2.2.2.2";
		
		ip=ip.replaceAll("(\\d+)","00$1");
		System.out.println(ip);
		ip=ip.replaceAll("0*(\\d{3})", "$1");
		System.out.println(ip);
		String[] arr=ip.split(" ");
		TreeSet<String> ts=new TreeSet<String>();	
		for(String s:arr)
		{
			ts.add(s);
			
		}
		for(String s:ts)
		{
			System.out.println(s.replaceAll("0*(\\d+)", "$1"));
		}
				
		
		
		
		String mail="abc12@sina.com";
		String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//较为精确的匹配
		//reg="\\w+@\\w+(\\.\\w+)";
		
		//mail.indexOf("@")!=-1;
		
		System.out.println(mail.matches(reg));
		
		
	}

}

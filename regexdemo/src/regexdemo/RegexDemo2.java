package regexdemo;

import java.util.regex.*;

public class RegexDemo2 {

	public static void main(String[] args) {
		getDemo();
	}
	public static void getDemo(){
		String str="ming tian jiu yao fang jia le ,da jia. ";
		String reg="\\b[a-z]{4}\\b";
		//String reg="[1-9]\\d{4,14}";
		//将规则封装成对象
		Pattern p=Pattern.compile(reg);
		//让正则对象和要作用的字符串相关联,获取匹配器对象
		Matcher m=p.matcher(str);
		//System.out.println(m.matches());//其实String类中的matches方法，用的就是pattern和matcher对象来完成的
		//m.find();//将规则作用到字符串上，并进行符合规则的子串查找
		
		
		while(m.find())
		{
			System.out.println(m.group());//用于获取匹配后结构
			System.out.println(m.start()+"....."+m.end());
		}
	}
}

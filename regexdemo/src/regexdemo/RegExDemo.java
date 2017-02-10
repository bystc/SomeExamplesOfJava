package regexdemo;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的表达式
 * 作用：用于专门操作字符串
 * 特点：用一些特定的符号来表示一些代码操作，这样就简化书写
 * 所以学习正则表达式就是学习一些特殊符号的运用
 * 
 * 对QQ号码进行校验
 * 要求:5-15 0不能开头，只能是数字
 */
public class RegExDemo {

	public static void main(String[] args) {
		//demo();
	
//		checkqq1();
//		
//		checktel();
		
		splitDemo();
		
	}
	
	public static void splitDemo()
	{
		String str="zhangsan.lisi.wangwu";
	//	String reg=" +";//按照多个空格来进行切割
		String reg="\\.";
		
		String[] arr=str.split(reg);//切割
		for(String s:arr)
		{
			System.out.println(s);
		}
		
	}
	
	
	
	public static void demo(){
		
		String str="b0";
		String reg="[a-zA-Z]\\d";
		boolean b=str.matches(reg);
		System.out.println(b);
		
	}
	public static void checktel()
	{
		String tel="1825484848";
		String telReg="1[358]\\d{9}";
		System.out.println(tel.matches(telReg));
	}
	
	public static void checkqq1()
	{
		
		String qq="145615151515151";
		String regex="[1-9]\\d{4,14}";
		boolean flag=qq.matches(regex);
		if(flag)
		{
			System.out.println(qq+"...is ok");
			
		}
		else{
			System.out.println(qq+"....is not ok");
		}
		
		
	}
	
	
	public static void checkQQ()
	{
		String qq="1234567";
//		Scanner in=new Scanner(System.in);
//		qq=in.nextLine();
		int len=qq.length();
		if(len>=5&&len<=15)
		{
			if(qq.startsWith("0")){
				char[] arr=qq.toCharArray();
				boolean flag=true;
				
				for(int x=0;x<arr.length;x++)
				{
					if(!(arr[x]>='0'&&arr[x]<='9'))
					{
						flag=false;
						break;
						
					}
				}
				if(flag)
				{
					System.out.println("qq:"+qq);
				}else{
					System.out.println("illegal character");
				}
			}
			else{
				System.out.println("cant be 0 ");
			}
			
		}
		else{
			System.out.println("length error!");
		}
	}
}

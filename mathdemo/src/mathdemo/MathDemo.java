package mathdemo;
import java.util.*;
public class MathDemo {
	public static void main(String[] args){
		Random r=new Random();
		for(int x=0;x<10;x++){
			//int d=(int)(Math.random()*6+1);
			int d=r.nextInt(10)+1;
			sop(d);
		}
	}
	public static void show()
	{
		double d=Math.ceil(12.31);//返回大于指定数据的最小整数
		double d1=Math.floor(12.34);//返回小于指定数据的最小整数
		long l=Math.round(12.54);//四舍五入
		double d2=Math.pow(2, 3);
		
		sop(d);
		sop(d1);
		sop(l);
		sop(d2);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}

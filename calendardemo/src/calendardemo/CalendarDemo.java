package calendardemo;
import java.util.*;
import java.text.*;
public class CalendarDemo {
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		
		String[]mons={"一月","二月","三月","四月"
				,"五月","六月","七月","八月"
				,"九月","十月","十一月","十二月"};
		
		int index=c.get(Calendar.MONTH);
		sop(c.get(Calendar.YEAR)+"年");
		//sop(c.get(Calendar.MONTH)+1+"月");
		sop(mons[index]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"日");
		sop("星期"+c.get(Calendar.DAY_OF_WEEK));
		
		
		
		
		/*
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		
		
		int year=Integer.parseInt(sdf.format(d));
		
		System.out.println(year);
		
		*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}

package hashmap;
import java.util.*;
class Student{
	private String id;
	private String name;
	Student(String id,String name){
		this.name=name;
		this.id=id;
	}

	public String toString(){
		return id+":::"+name;
	}
	
}
public class HashMapTest {
	
	public static void demo(){
		HashMap<String,List<Student>>czbk=new HashMap<String,List<Student>>();
		List<Student> yure=new ArrayList<Student>();
		List<Student> jiuye=new ArrayList<Student>();
		czbk.put("yure", yure);
		czbk.put("jiuye", jiuye);
		yure.add(new Student("01","zhangsa"));
		yure.add(new Student("04","wangwu"));
		jiuye.add(new Student("01","zhouqo"));
		jiuye.add(new Student("02","zhaoki"));
		
		Iterator<String>it=czbk.keySet().iterator();
		while(it.hasNext()){
			String roomName=it.next();
			List<Student>room=czbk.get(roomName);
			System.out.println(roomName);
			getInfos(room);
		}
	}
	
	public static void getInfos(List<Student>list){
		Iterator<Student>it=list.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s);
		}
	}
	
	public static void main(String[] args){
		
		demo();
		
	}
		/*
		HashMap<String,HashMap<String,String>>czbk=new HashMap<String,HashMap<String,String>>();
		HashMap<String,String>yure=new HashMap<String,String>();
		HashMap<String,String>jiuye=new HashMap<String,String>();
			
		czbk.put("yureban",yure);
		czbk.put("jiuyeban", jiuye);
		
	
		yure.put("01", "zhangsan");
		yure.put("02", "lisi");
		
		
		jiuye.put("01", "wangwu");
		jiuye.put("02", "zhaoliu");
		Iterator<String>it=czbk.keySet().iterator();
		while(it.hasNext()){
			String roomName=it.next();
			HashMap<String,String>room=czbk.get(roomName);
			System.out.println(roomName);
			getStudentInfo(room);
		}
//		getStudentInfo(jiuye);
//		getStudentInfo(yure);
		
	}
	public static void getStudentInfo(HashMap<String,String>roomMap){
		Iterator<String> it=roomMap.keySet().iterator();
		while(it.hasNext())
		{
			String id=it.next();
			String name=roomMap.get(id);
			System.out.println(id+":"+name);
		}
	}
	*/
}


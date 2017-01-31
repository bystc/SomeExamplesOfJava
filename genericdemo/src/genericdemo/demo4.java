package genericdemo;
import java.util.*;
public class demo4 {
	public static void main(String[] args){
		TreeSet<Student>ts=new TreeSet<Student>(new Comp());
		ts.add(new Student("abc1"));
		ts.add(new Student("abc2"));
		ts.add(new Student("abc3"));
		System.out.println(ts);
		Iterator<Student> it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
}
class Comp implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		return p2.getName().compareTo(p1.getName());
	}
}
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return "person:"+name;
	}
}
class Student extends Person{
	Student(String name){
		super(name);
	}
}
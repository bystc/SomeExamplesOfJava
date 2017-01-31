package objectstreamdemo;
import java.io.*;
public class Person implements Serializable {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+":"+age;
	}
	
}

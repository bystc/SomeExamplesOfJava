package objectstreamdemo;
import java.io.*;
public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//writeObj();
		readObj();

	}
	public static void readObj() throws IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj.txt"));
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}
	public static void writeObj() throws IOException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		oos.writeObject(new Person("lisi",39));
		oos.writeObject(new Person("lis2i",439));
		oos.writeObject(new Person("lis23i",439));
		oos.writeObject(new Person("li3si",39));
		oos.writeObject(new Person("lisi",39));
		
		
		oos.close();
	}

}

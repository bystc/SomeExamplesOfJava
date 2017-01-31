package datastreamdemo;
import java.io.*;
public class DataStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//writeData();
		//readData();
//		writeUTFDemo();
//		
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("utf.txt"),"utf-8");
//		osw.write("nihao");
//		osw.close();
		readUTFDemo();
	}
	public static void readUTFDemo() throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream("utfdata.txt"));
		String s=dis.readUTF();
		System.out.println(s);
		dis.close();
	}
	
	public static void writeUTFDemo() throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("utfdata.txt"));
		dos.writeUTF("nihao");
		dos.writeUTF("你好");
		dos.close();
	}
	
	public static void readData() throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream("123.txt"));
		int num=dis.readInt();
		boolean b=dis.readBoolean();
		double d=dis.readDouble();
		System.out.println(num);
		System.out.println(b);
		System.out.println(d);
	}
	public static void writeData() throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("123.txt"));
		dos.writeInt(2131);
		
		dos.writeBoolean(true);
		dos.writeDouble(213131.424);
		dos.close();
	}

}

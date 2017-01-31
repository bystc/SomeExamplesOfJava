package filereader;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("demo.txt");
		
//		int ch=fr.read();//read()一次读一个字母，而且会自动往下读
//		
//		System.out.println("ch="+(char)ch);
//		
		int ch=0;
		while((ch=fr.read())!=-1){
			
			System.out.print((char)ch);
		}
		fr.close();
	}

}

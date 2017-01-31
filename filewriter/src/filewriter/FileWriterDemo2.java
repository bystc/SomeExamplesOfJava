package filewriter;
import java.io.*;

public class FileWriterDemo2 {
	public static void main(String[] args){
		FileWriter fw=null;
		try{
		
			fw=new FileWriter("demo.txt");
			fw.write("ababac");
		
		}
		
		catch(IOException e){
			System.out.println("catch:"+e.toString());
		}
		finally{
			try {
				if(fw!=null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}
	}
}

package bufferedread;
import java.io.*;
public class BufferedReadDemo {
	public static void main(String[] args)throws IOException{
		FileReader fr=new FileReader("buf.txt");
		BufferedReader bufr=new BufferedReader(fr);
		
		String line=null;
		while((line=bufr.readLine())!=null){
			System.out.println(line);
			
		}
		bufr.close();
	}
}

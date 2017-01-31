package filereader;
import java.io.*;
public class CopyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//将C盘的一个文本文件复制到D盘
		copy2();
		
	}
	public static void copy2(){
		FileWriter fw=null;
		FileReader fr=null;
		try{
			fw=new FileWriter("d:\\SystemDemo_copy.txt");
			
			fr=new FileReader("d:\\SystemDemo.java");
			char[]buf=new char[1024];
			int len=0;
			while((len=fr.read(buf))!=-1){
				fw.write(buf,0,len);
			}
		}catch(IOException e){
			throw new RuntimeException("读写失败");
		}
		finally{
			if(fr!=null)
			try{
				fr.close();
			}
			catch(IOException e){
				
			}
			if(fw!=null)	
			try{
				fw.close();
			}
			catch(IOException e){
				
			}
		}
	}
	
	
	
	
	
	public static void copy()throws IOException{
		FileWriter fw=new FileWriter("RuntimeDemo_copy.txt");
		
		FileReader fr=new FileReader("RuntimeDemo.java");
		
		int ch=0;
		
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();
	}

}

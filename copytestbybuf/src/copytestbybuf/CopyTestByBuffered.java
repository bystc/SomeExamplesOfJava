package copytestbybuf;
import java.io.*;
public class CopyTestByBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		
		try{
			bufr=new BufferedReader(new FileReader("BufferedWriterDemo.java"));
			bufw=new BufferedWriter(new FileWriter("bufWriter_Copy.txt"));
			String line=null;
			while((line=bufr.readLine())!=null){
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e){
			throw new RuntimeException("读写失败");
			
		}
		finally{
			try{
				if(bufr!=null)
					bufr.close();
			}
			catch(IOException e){
				throw new RuntimeException("读取关闭失败");
			}
			try{
				if(bufw!=null)
					bufw.close();
			}
			catch(IOException e){
				throw new RuntimeException("写入失败");
			}
		}
		
	}

}

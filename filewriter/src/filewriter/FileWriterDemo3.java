package filewriter;
import java.io.*;
public class FileWriterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾出进行数据续写
		FileWriter fw=null;
		try {
			fw = new FileWriter("demo.txt",true);
			fw.write("nihao\r\nhaha");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catch:"+e.toString());
		}
		
		
		
		finally{
			try{
				
			if(fw!=null)
				fw.close();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catch:"+e.toString());
		}
	}

	}
}

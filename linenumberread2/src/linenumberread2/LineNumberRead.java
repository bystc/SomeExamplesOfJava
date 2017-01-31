package linenumberread2;
import java.io.*;
public class LineNumberRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("MyBufferedReaderDemo.java");
		LineNumberReader lnr=new LineNumberReader(fr);
		String line=null;
		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+" "+line);
		}
		lnr.close();
	}

}

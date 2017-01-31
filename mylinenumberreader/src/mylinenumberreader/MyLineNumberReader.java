package mylinenumberreader;
import java.io.*;
class MyLineNumber{
	private Reader r;
	private int lineNumber;
	MyLineNumber(Reader r){
		this.r=r;
	}
	public String myReadLine()throws IOException{
		
		lineNumber++;
		
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((r.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void setLineNumber(int lineNumber){
		this.lineNumber=lineNumber;
	}
	public int getLineNumber(){
		return lineNumber;
	}
	public void myClose()throws IOException{
		r.close();
	}
}



public class MyLineNumberReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("MyBufferedReaderDemo.java");
		
		MyLineNumber mylnr=new MyLineNumber(fr);
		String line=null;
		
		while((line=mylnr.myReadLine())!=null){
			System.out.println(mylnr.getLineNumber()+" "+line);
			
		}
		mylnr.myClose();
	}

}

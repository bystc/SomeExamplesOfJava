package mybufferedreader;

import java.io.*;

class MyBufferedReader extends Reader{
	
	private Reader r;
	
	MyBufferedReader(Reader r){
		this.r=r;
	}
	
	public String myReadLine() throws IOException{
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=r.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0){
			return sb.toString();
		}
		return null;
		
		
	}
	
	public void myClose() throws IOException{
		r.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return r.read(cbuf,off,len);
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		r.close();
	}
}





public class MyBufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("buf.txt");
		
		MyBufferedReader mybuf=new MyBufferedReader(fr);
		
		String line=null;
		while((line=mybuf.myReadLine())!=null){
			System.out.println(line);
		}
		mybuf.myClose();
	}

}

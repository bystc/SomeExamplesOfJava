package copymp3;
import java.io.*;
/*
 * 
 * MP3的复制，通过缓冲区
 * BufferedOutputStream
 * BufferedInputStream
 * 
 */
public class CopyMp3 {
	public static void main(String[] args) throws IOException{
		long start=System.currentTimeMillis();
		copy1();
		long end=System.currentTimeMillis();
		System.out.println((end-start)+"ms");
	}
	public static void copy1() throws IOException{
		BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("d:\\0.mp3"));
		BufferedInputStream bufis=new BufferedInputStream(new FileInputStream("d:\\1.mp3"));
		int by=0;
		while((by=bufis.read())!=-1){
			bufos.write(by);
		}
		bufos.close();
		bufis.close();

	}
}

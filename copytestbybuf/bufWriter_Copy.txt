package bufferedwriter;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("buf.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
		
		
		for(int x=1;x<5;x++){
			bufw.write("abcd"+x);
			bufw.newLine();
			bufw.flush();
		}
		//bufw.flush();
		bufw.close();
		//关闭缓冲区就是关闭缓冲区里的流对象
	}

}

package transtream;
import java.io.*;
public class TranStream {
/*
 * 流操作的基本规律：
 * 最痛苦的就是流对象有很多，不知道该用哪一个
 * 通过两个明确来完成
 * 1，明确源和目的
 * 		源：输入流：InputStream，Reader
 * 		目的：输出流 OutputStream,Writer
 * 2，操作的数据是否为纯文本
 * 		是：字符流
 * 		不是：字节流
 * 3，当体系明确后，再明确要使用哪一个具体的对象
 * 通过设备来进行区分
 * 源设备：内存，硬盘，键盘
 * 目的设备：内存，硬盘，控制台
 * 4，将一个文本文件中的数据存储到另一个文件中，复制文件
 * 源：InputStream,Reader
 * 是不是操作文本文件
 * 是：这时就可以选择Reader
 * 这样体系就明确了
 * 接下来明确要使用该体系中的哪个对象
 * 明确设备：硬盘上一个文件
 * Reader体系中可以操作文件的对象是 FileReader
 * 
 * 是否需要提高效率 是：加入Reader体系中的缓冲区 BufferedReader
 * FileReader fr=new FileReader("a.txt");
 * BufferedReader bufr=new BufferedReader(fr);
 * 
 * 目的：OutputStream,Writer
 * 目的是否是纯文本
 * 是：Writer
 * 明确设备：硬盘，一个文件
 * Writer体系中可以操作文件的对象FileWriter
 * 是否需要提高效率 是：加入Writer体系中的缓冲区 BufferedWriter
 * FileWriter fw=mew FileWriter("b.txt");
 * BufferedWriter bufw=new BufferedWriter(fw);
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//获取键盘录入对象
		//InputStream in=System.in;
		
		//将字节流对象转成字符流对象，使用转换流，InputStreamReader
		//InputStreamReader isr=new InputStreamReader(in);
		
		//为了提高效率，将字符串进行缓冲区技术高效操作，使用BufferedReader
		
		//BufferedReader bufr=new BufferedReader(isr);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(new FileInputStream("CopyMp3.java")));
		
		//OutputStream out=System.out;
		//OutputStreamWriter osw=new OutputStreamWriter(out);
		//BufferedWriter bufw=new BufferedWriter(osw);
		//BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("1.txt")));
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));

		
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			
		}
		
		bufr.close();
		
		
		
	}

}

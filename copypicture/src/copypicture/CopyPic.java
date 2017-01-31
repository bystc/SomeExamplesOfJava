package copypicture;
import java.io.*;
/*复制一个图片
 * 用字节读取流对象和图片关联
 * 用字节写入流对象创建一个图片文件，用于存储获取到的图片数据
 * 通过循环读写，完成数据的存储
 * 关闭资源
 * 
 */

public class CopyPic {
	public static void main(String[] args){
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try{
			fos=new FileOutputStream("d:\\2.bmp");
			fis=new FileInputStream("d:\\1.bmp");
			byte[]buf=new byte[1024];
			int len=0;
			while((len=fis.read(buf))!=-1){
				fos.write(buf,0,len);
				
			}
			
			
		}
		catch(IOException e){
			throw new RuntimeException("复制文件失败");
		}
		finally{
			try{
				if(fis!=null)
					fis.close();
				
				
			}
			catch(IOException e){
				throw new RuntimeException("读取关闭失败");
			}
			try{
				if(fos!=null)
					fos.close();
				
				
			}
			catch(IOException e){
				throw new RuntimeException("写入关闭失败");
			}
		}
	}
}

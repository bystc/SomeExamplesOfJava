package filedemo;

import java.io.File;

/*
 * 删除一个带内容的目录，在windows中，是从里往外删
 * 所有要用到递归原理 
 *
 *删除后文件不会进入回收站
 */
public class RemoveDir {

	public static void main(String[] args) {
		File dir =new File("d:\\test");
		removeDir(dir);
	}
	public static void removeDir(File dir){
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(files[x].isDirectory())
				removeDir(files[x]);
			else
				System.out.println(files[x].toString()+"::"+files[x].delete());
				
		}
		System.out.println(dir.toString()+"::"+dir.delete());
	}

}

package threaddemo;
class Demo extends Thread{
	public void run(){
		for(int x=0;x<60;x++){
		System.out.println("demo run"+x);
		}
	}
}
public class ThreadDemo {

	
	
	public static void main(String[] args) {
		Demo d=new Demo();//创建了一个线程
		d.start();//开启线程并执行该线程的run方法
		//d.run(); 仅仅是对象调用方法，而线程创建了，并没有运行
		for(int x=0;x<60;x++){
			System.out.println("hello world.."+x);
		}
	}

}

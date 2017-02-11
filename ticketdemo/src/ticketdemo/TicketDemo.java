package ticketdemo;
class Ticket implements  Runnable{//extends Thread{
	private  int  ticket=100;
	Object obj=new Object();
	public void run(){
		while(true)				
		{	
			synchronized(obj){
				if(ticket>0){
					try{
						Thread.sleep(10);
					}catch(Exception e){
						throw new RuntimeException();
					}
			
			System.out.println(Thread.currentThread().getName()+"sale: " + ticket--);
			}
			}
		}
	}
}
public class TicketDemo {

	public static void main(String[] args) {
		Ticket t=new Ticket();//没有创建线程
		
		Thread t1=new Thread(t);//创建了一个线程
		Thread t2=new Thread(t);//创建了一个线程
		Thread t3=new Thread(t);//创建了一个线程
		Thread t4=new Thread(t);//创建了一个线程
		t1.start();
		t2.start();
		t3.start();		
		t4.start();
		
//		Ticket t1=new Ticket();
//		Ticket t2=new Ticket();
//		Ticket t3=new Ticket();
//		Ticket t4=new Ticket();
//		t1.start();
//		t2.start();
//		t3.start();		
//		t4.start();
	}

}

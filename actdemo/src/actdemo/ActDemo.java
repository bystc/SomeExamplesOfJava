package actdemo;
/*1.事件源
 * 2.事件
 * 3.监听器
 * 4.事件处理
 *事件源：就是awt包或者swing包中的那些图形界面组件
 *
 *事件：每一个事件源都有自己特有的对应事件和共性事件
 *
 *监听器：将可以触发某一个事件的动作（不止一个动作）都已经封装到了监听器中
 * 
 *以上三者在java中已经定义好了
 *直接获取对象来用就可以了
 *
 *我们要做的事情是，就是对产生的动作进行处理
 * 
 * 
 */
import java.awt.*;
import java.awt.event.*;

import javafx.stage.WindowEvent;
public class ActDemo {

	public static void main(String[] args) {
		Frame f=new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(300,200);
		f.setLayout(new FlowLayout());
		Button b=new Button("I am a button!");
		f.add(b);
		
		f.addWindowListener(new WindowAdapter()
		{
				public void windowClosing(WindowEvent e)
				{
					
						
						System.exit(0);
				}
				public void windowActivated(WindowEvent e){
					System.out.println("wo huo le ");
					
				}
				public void windowOpened(WindowEvent e){
					System.out.println("wobei dakaile");
					
				}
				
				
				
		});
		
			
		
		
		
		f.setVisible(true);
		
		
	}

}

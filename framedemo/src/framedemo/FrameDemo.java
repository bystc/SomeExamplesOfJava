package framedemo;
import java.awt.*;
import java.awt.event.*;

public class FrameDemo {
	private Frame f;
	private Button but;
	FrameDemo(){
		init();
	}
	public void init(){
		f=new Frame("my frame");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		
		but=new Button("my button");
		
		f.add(but);
		
		myEvent();
		
		f.setVisible(true);
	}
	private void myEvent(){
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				//System.out.println(e.toString());
				System.exit(0);
			}
		});
		but.addActionListener(new ActionListener()
		{		
			public void actionPerformed(ActionEvent e){
				System.out.println("按钮干的");
				System.exit(0);
			}
		
				
	    });
		
	}
	public static void main(String[] args){
		new FrameDemo();
	}
}

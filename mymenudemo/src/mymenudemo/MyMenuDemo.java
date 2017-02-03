package mymenudemo;
import java.awt.*;
import java.awt.event.*;
public class MyMenuDemo {

	private Frame f;
	private MenuBar mb;
	private Menu m,subMenu;//有右箭头
	private MenuItem closeItem,subItem,openItem,saveItem;//没有右箭头
	
	MyMenuDemo()
	{
		init();
	}
	public void init(){
		f=new Frame("My window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		mb=new MenuBar();
		
		m=new Menu("File");
		openItem=new MenuItem("open");
		saveItem=new MenuItem("save");
		subMenu=new Menu("Submenu");
		subItem=new MenuItem("Subitems");
		closeItem=new MenuItem("Exit");
		subMenu.add(subItem);
		//m.add(subMenu);
		
		m.add(openItem);
		m.add(saveItem);
		m.add(closeItem);
		mb.add(m);
		
		f.setMenuBar(mb);
		
		myEvent();
		f.setVisible(true);
		
		
		
	}
	private void myEvent(){
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		f.addWindowListener(new WindowAdapter()
		{		
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
	    });
		
		
		
				
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MyMenuDemo();

	}

}

package mywindowdemo;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
public class MyWindowDemo {
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	private Dialog d;
	private Label lab;
	private Button okbut;
	
	MyWindowDemo(){
		init();
	}
	public void init(){
		f=new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());//默认是边界布局，全填中
		tf=new TextField(60);
		but=new Button("go into");
		ta=new TextArea(25,70);
		d=new Dialog(f,"提示信息-self",false);
		d.setBounds(400,200,500,150);
		d.setLayout(new FlowLayout());
		lab=new Label();
		okbut=new Button("ok");
		d.add(lab);
		d.add(okbut);
		
		
		f.add(tf);
		f.add(but);
		f.add(ta);
		myEvent();
		f.setVisible(true);
	}
	private void myEvent(){
		
		okbut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d.setVisible(false);
			}
		});
				
				
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				d.setVisible(false);
			}
		});
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();
			}
		});
				
				
		
		
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				showDir();
				//tf.setText("");
				//System.out.println(text);
			}
		});
				
				
		
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		
		
		});
		
		
	}
	
	private void showDir(){
		String dirPath=tf.getText();
		File dir=new File(dirPath);
		if(dir.exists()&&dir.isDirectory())
		{
			ta.setText("");
			String[] names=dir.list();
			for(String name:names){
				ta.append(name+"\r\n");
			}
		}
		else{
			String info="The information you input: "+dirPath+" is wrong.Please input again!";
			lab.setText(info);
			d.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindowDemo();
	}

}

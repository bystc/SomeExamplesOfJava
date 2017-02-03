package mouseandkeyevent;
import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyEvent {
	private Frame f;
	private Button but;
	private TextField tf;

	
	
	MouseAndKeyEvent(){
		init();
	}
	public void init(){
		f=new Frame("my frame");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		tf=new TextField(20);
		but=new Button("my button");
		f.add(tf);
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
		tf.addKeyListener(new KeyAdapter()
		{		
			public void keyPressed(KeyEvent e)
			{
				int code=e.getKeyCode();
				if(!(code>=KeyEvent.VK_0&&code<=KeyEvent.VK_9))
					System.out.println(code+"...是非法的");
				e.consume();
			}
			
			
		});
				
		
		but.addKeyListener(new KeyAdapter()
		{		
			public void keyPressed(KeyEvent e){
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)
					//System.exit(0);
					System.out.println("ctrl+enter is running!");
			}
		});
		
		
		
		but.addActionListener(new ActionListener()
		{		
			public void actionPerformed(ActionEvent e){
				System.out.println("action ok");
			}
		});
				
		
		
		but.addMouseListener(new MouseAdapter()
		{
			private int count=1;
			private int clickcount=1;
			public void mouseEntered(MouseEvent e){
				System.out.println(count++);
		}
			public void mouseClicked(MouseEvent e){
				if(e.getClickCount()==2)
				System.out.println("双击动作"+clickcount++);
			}
		});
				
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAndKeyEvent();
	}

}

package mymenudemo;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MyMenuDemo {

	private Frame f;
	private MenuBar mb;
	private Menu m,subMenu;//有右箭头
	private MenuItem closeItem,subItem,openItem,saveItem;//没有右箭头
	private TextArea ta;
	private FileDialog openDia,saveDia;
	private File file;
	
	MyMenuDemo()
	{
		init();
	}
	public void init(){
		f=new Frame("My window");
		f.setBounds(300,100,600,500);
		//f.setLayout(new FlowLayout());
		mb=new MenuBar();
		
		ta=new TextArea();
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
		
		openDia=new FileDialog(f,"i want to open",FileDialog.LOAD);
		saveDia=new FileDialog(f,"i want to save",FileDialog.SAVE);
		f.add(ta);
		
		myEvent();
		f.setVisible(true);
		
		
		
	}
	private void myEvent(){
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(file==null)
				{
				saveDia.setVisible(true);
				String dirPath=saveDia.getDirectory();
				String fileName=saveDia.getFile();
				if(dirPath==null||fileName==null)
					return ;
				file=new File(dirPath,fileName);
				}
				try{
					BufferedWriter bufw=new BufferedWriter(new FileWriter(file));
					String text=ta.getText();
					bufw.write(text);
					bufw.close();
				}
				catch(IOException i){
					throw new RuntimeException();
				}
			}
		});
		
		
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				openDia.setVisible(true);
				String dirPath=openDia.getDirectory();
				String fileName=openDia.getFile();
				System.out.println(dirPath+"..."+fileName);
				if(dirPath==null||fileName==null)
					return ;
				ta.setText("");
				file=new File(dirPath,fileName);
				try{
					BufferedReader bufr=new BufferedReader(new FileReader(file));
					String line =null;
					while((line=bufr.readLine())!=null){
						ta.append(line+"\r\n");
					}
				}catch(IOException i){
					throw new RuntimeException("Reading Error!");
				}
				
			}
		});
		
		
		
		
		
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
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

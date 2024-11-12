import java.util.*;
import java.awt.*;
import java.applet.*;
import java.text.*; 
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.nio.charset.StandardCharsets; 

public class LoginPage extends JFrame implements ActionListener,Runnable
{	
    JLabel l1,l2,d,t3,pl1,pl2,ul1,title,logo,back,back2;
    JPasswordField jp;
	JTextField t,pt,pt2,ut;
	TextArea pt6,pt7;
	JButton b1,b2,hb1,hb2,pb1,pb2,pb3,ub1,ub2,pb6,pb7;
	JPanel f1,f2,f3,f4,f5,f6,f7;
	Thread th=null;  
    String timeString = "";  
	Calendar cal = Calendar.getInstance(); 
	String pack="",unpack="";
	MenuBar menubar;
	Menu menu;
	MenuItem home,packer,unpacker;
	
	
LoginPage() 
	{         
	     
	     setSize(410,405);
		 setTitle("FilePacker & FileUnPacker");
		 setVisible(true);
		 setLayout(null);
		 
		 back2=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p1.jpeg"));
	
//******************JPanel 1********************
		 
		 f1=new JPanel();
		 f1.setLayout(new BorderLayout());
		 title=new JLabel("FilePacker & FileUnPacker");
		 f1.add(back2);
		
		 logo=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p.jpeg"));
		 
		 title.setFont(new Font("Arial",Font.BOLD,15));
		 
		 d=new JLabel();
		 t3=new JLabel();
		 t3=new JLabel("Date :"+cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR));
		 
		 f1.setBounds(0,0,400,100);
		 logo.setBounds(2,2,100,90);
		 title.setBounds(120,20,200,15);
		 d.setBounds(280,50,120,50);
		 t3.setBounds(280,30,100,60);
		 
		 back2.add(logo);
		 back2.add(t3);
		 back2.add(d);
		 back2.add(title);
		 
		 add(f1);
		 
		 menubar=new MenuBar();
		 menu=new Menu("View");
		 home=new MenuItem("Home");
		 packer=new MenuItem("Packer");
		 unpacker=new MenuItem("UnPacker");
		 
		 
		 menu.add(home);
		 menu.add(packer);
		 menu.add(unpacker);
		 
		 menubar.add(menu);
		 
		 home.addActionListener(this);
		 packer.addActionListener(this);
		 unpacker.addActionListener(this);

		 
		 
		 th = new Thread(this);  
         th.start(); 
		  
 //******************JPanel 2********************
		  
		 f2=new JPanel();
		 f2.setBounds(0,100,400,266);
		 back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	 	 f2.setLayout(new BorderLayout());
		 f2.add(back);
	     l1=new JLabel("Username:");
		 l2=new JLabel("Password:");
		 
		 l1.setFont(new Font("Arial",Font.BOLD,15));
		 l2.setFont(new Font("Arial",Font.BOLD,15));
	
		  
	     t=new JTextField();
		 jp=new JPasswordField();
		
		 b1=new JButton("Sumbit");
		 b2=new JButton("Cancel");
		 	 
		 b1.setBackground(new Color(87, 186, 45));
		 b1.setForeground(new Color(255,255,255));
		 
		 b2.setBackground(new Color(255,0,0));
		 b2.setForeground(new Color(255,255,255));
		 
		 
		 b1.setFont(new Font("Serif",Font.BOLD,15));
		 b2.setFont(new Font("Serif",Font.BOLD,15));
		 
		l1.setBounds(100,0,100,120);
		t.setBounds(200,50,120,20);
		l2.setBounds(100,70,100,120);
		jp.setBounds(200,120,120,20);
		b1.setBounds(100,170,90,20);
		b2.setBounds(200,170,90,20);
		
		 back.add(l1);
		 back.add(t);
		 back.add(l2);
		 back.add(jp);
		 back.add(b1);
		 back.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);  
	    add(f2);
		
//******************JPanel 3********************
		  
		f3=new JPanel();
		f3.setBounds(0,100,400,250);
		back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	 	f3.setLayout(new BorderLayout());
		f3.add(back);
		
		f3.setVisible(false);
		
		
		hb1=new JButton("Pack");
		hb2=new JButton("UnPack");
		
		 hb1.setBackground(new Color(245, 188, 122));
		 hb1.setForeground(new Color(255,255,255));
		 
		 hb2.setBackground(new Color(245, 188, 122));
		 hb2.setForeground(new Color(255,255,255));
		 
		 hb1.setFont(new Font("Serif",Font.BOLD,15));
		 hb2.setFont(new Font("Serif",Font.BOLD,15));
		 
		hb1.setBounds(50,90,120,30);
		hb2.setBounds(200,90,120,30);
		
		back.add(hb1);
		back.add(hb2);
		
		hb1.addActionListener(this);
		hb2.addActionListener(this);
	
	    add(f3);
		
//******************JPanel 4********************	
	
	    f4=new JPanel();
		f4.setBounds(0,100,400,250);
		back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	 	f4.setLayout(new BorderLayout());
		f4.add(back);
		f4.setVisible(false);
		
	
		
	     pl1=new JLabel("Directory name:");
		 pl2=new JLabel("Pack File name:");
		
	     pt=new JTextField();
		 pt2=new JTextField();
		 pb1=new JButton("Sumbit");
		 pb2=new JButton("Previous");
		
		pl1.setBounds(70,0,100,120);
		pt.setBounds(200,50,120,20);
		pl2.setBounds(70,70,100,120);
		pt2.setBounds(200,120,120,20);
		pb1.setBounds(90,170,90,20);
		pb2.setBounds(210,170,90,20);
		
		
		back.add(pl1);
		back.add(pt);
		back.add(pl2);
		back.add(pt2);
		back.add(pb1);
		back.add(pb2);
		
		pb1.addActionListener(this);
		pb2.addActionListener(this);
		
		add(f4);
//******************JPanel 5********************	

        f5=new JPanel(); 
		f5.setBounds(0,100,400,250);
		back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	    f5.setLayout(new BorderLayout());
		f5.add(back);
		f5.setVisible(false);
     

		
	    ul1=new JLabel("File name:");
	    ut=new JTextField();
		
		ub1=new JButton("Sumbit");
		ub2=new JButton("Previous");
		
		ul1.setBounds(100,0,100,120);
		ut.setBounds(200,50,120,20);
		ub1.setBounds(90,170,90,20);
		ub2.setBounds(210,170,90,20);
		
		back.add(ul1);
		back.add(ut);
	
		back.add(ub1);
		back.add(ub2);
		
		ub1.addActionListener(this);
		ub2.addActionListener(this);

        add(f5);
		
 //******************JPanel 6********************
 
        f6=new JPanel(); 
		f6.setBounds(0,100,400,250);
		back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	    f6.setLayout(new BorderLayout());
		f6.add(back); 
		f6.setVisible(false);
		
		
		
		pt6=new TextArea();
		pb6=new JButton("Previous");
	
		pt6.setBounds(0,0,400,200);
		pb6.setBounds(150,210,90,20);
		
		back.add(pt6);
		back.add(pb6);

		pb6.addActionListener(this);

        add(f6);
		
//******************JPanel 7********************
	
		f7=new JPanel(); 
		f7.setBounds(0,100,400,250);
		back=new JLabel(new ImageIcon("C:\\Users\\Yogi\\Desktop\\mp\\p2.jpeg"));
	    f7.setLayout(new BorderLayout());
		f7.add(back);
		f7.setVisible(false);
		
		pt7=new TextArea();
		pb7=new JButton("Previous");
	
		pt7.setBounds(0,0,400,200);
		pb7.setBounds(150,210,90,20);
		
		back.add(pt7);
		back.add(pb7);

		pb7.addActionListener(this);

        add(f7);
		
		addWindowListener(new myadapter());
		
 }
 
 
		
 public void run() 
 {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");  
            java.util.Date date = cal.getTime();  
            timeString = formatter.format(date);  
            d.setText("Time :"+timeString);   
  
            th.sleep( 1000 );  /// interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
 }  
  
	public void actionPerformed(ActionEvent ae)
	{
		
		String user_name=t.getText();
		String password=jp.getText();
		
		
		String folder_name=pt.getText();
		String new_file=pt2.getText();
		String file_name=ut.getText();

		
		if(ae.getSource()==b1)
		{
  	       try
		   {   	
				if(user_name.equals("abc")&&password.equals("123"))
				{	
					setMenuBar(menubar);
					f2.setVisible(false);
					f3.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Enter correct password","ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e){}  
		}	

		
		if(ae.getSource()==b2)
		{
			t.setText("");
			jp.setText("");
		}
		
		
		if(ae.getSource()== hb1 ||ae.getSource()==packer)
		{
            f7.setVisible(false);
			f5.setVisible(false);
			f6.setVisible(false);
			f3.setVisible(false);
			
			f4.setVisible(true);

		}
      

		if(ae.getSource()==hb2 || ae.getSource()==unpacker)
		{
		    f7.setVisible(false);
			f6.setVisible(false);
		    f4.setVisible(false);
			f3.setVisible(false);
			
			f5.setVisible(true);
		    
		}
		
		
	  if(ae.getSource()==pb1)
		{   
				try{
					pack="";
		     String FolderName =folder_name;
             String PackFile =new_file;     
			
            File fobj = new File(FolderName);

            

            File fpackobj = new File(PackFile);
            fpackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(fpackobj);

            if(fobj.exists())
            {
                File allfiles[] = fobj.listFiles();

               pack+="File names are : \n";

                byte Buffer[] = new byte[1024];
                int ret = 0,Counter = 0;

                String name;

                for(int i = 0; i< allfiles.length; i++)
                {
                    name = allfiles[i].getName();

                        name = name + " " + (allfiles[i].length());
                        pack+="File Name : "+allfiles[i].getName()+" with length : "+allfiles[i].length() +"bytes\n";

                        for(int j = name.length(); j < 100; j++)    // Header formation
                        {
                            name = name + " ";
                        }

                        byte HeaderByte [] = name.getBytes();   // String to byte array conversion

                        fout.write(HeaderByte,0,HeaderByte.length); // write header in packed file

                        FileInputStream fiobj = new FileInputStream(allfiles[i]);

                        while((ret = fiobj.read(Buffer)) != -1)
                        {
                            fout.write(Buffer,0,ret);
                        }  
                        Counter++;
                    
                }

                pack+="----- Summary -----\n";
                pack+="Number of files scanned : "+allfiles.length+"\n";
                pack+="Number of files packed succesfully : "+ Counter+"\n";

       
            }
            else
            {
               pack+="There is no such folder..\n";
            }
		}
	    catch(Exception obj)
        {
            pack+="Exception occured : "+obj;
        }	
		   pt6.setText("");
		   pt6.setText(pack);
		   f4.setVisible(false);
			f6.setVisible(true);
			
		}
	

		if(ae.getSource()==pb2 || ae.getSource()==home)
		{
			f7.setVisible(false);
			f6.setVisible(false);
		    f5.setVisible(false);
		    f4.setVisible(false);
			
			f3.setVisible(true);
		}
		
	  if(ae.getSource()==ub1)
		{
		try
         {
           unpack="";
            String PackFile = file_name;
            File fpackobj = new File(PackFile);

            FileInputStream fin = new FileInputStream(fpackobj);
            int Ret = 0, Count = 0;
            byte Header[] = new byte[100];

            if(fpackobj.exists())
            {
                while((Ret = fin.read(Header,0,100)) > 0)
                {
                    String StrHeader = new String(Header);

                    String Arr[] = StrHeader.split(" ");

                    File obj = new File(Arr[0]);
                    obj.createNewFile();
                    unpack+="New file dropped with name : "+Arr[0]+"\n";

                    int FileSize = Integer.parseInt(Arr[1]);

                    byte DataArray[] = new byte[FileSize];

                    fin.read(DataArray,0,FileSize);

                    FileOutputStream fout = new FileOutputStream(obj);
                    fout.write(DataArray,0,FileSize);

                    Count++;
                }
                unpack+="----- Summary -----\n";
                unpack+="Number of files unpacked succesfully : "+Count+"\n";

               
            }
            else
            {
                unpack+="There is no such file..\n";
            }

        }
        catch(Exception obj)
        {
            unpack+="Exception occured : "+obj+"\n";
        }
		
			pt7.setText("");
		    pt7.setText(unpack);
			f5.setVisible(false);
			f7.setVisible(true);
		}
	
		if(ae.getSource()==ub2 || ae.getSource()==home)
		{
			f7.setVisible(false);
			f6.setVisible(false);
		    f5.setVisible(false);
			f4.setVisible(false);
			
		    f3.setVisible(true);
		}
		
	  if(ae.getSource()==pb6)
		{
			f6.setVisible(false);
			f4.setVisible(true);
		}
		
		 if(ae.getSource()==pb7)
		{
			f7.setVisible(false);
			f5.setVisible(true);
		}
	}

public static void main(String args[]) 
	{
		LoginPage lg=new  LoginPage();
	}


class myadapter extends WindowAdapter
{
	public void  windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
}
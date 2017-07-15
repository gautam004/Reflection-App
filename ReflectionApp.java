import java.lang.reflect.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ReflectionApp
{
	JFrame jf;
	JPanel jp,jp2;
	JLabel jl1,jl2;
	JTextField tf1;
	JButton jb1;
	int w,h;
	ReflectionApp()
	{
		
		jf=new JFrame("REFLECTION-APP");
		
		Toolkit t =jf.getToolkit();
		Dimension screenSize = t.getScreenSize();
		w=screenSize.width;
		h=screenSize.height;
		
		jf.setSize(w,h);
		

		
		
		jp=new JPanel();
		jp.setBounds(0,0,w,h);
		jf.setContentPane(jp);
		jp.setBackground(Color.red);
		
		
		
		
		jp2=new JPanel();
		jp2.setBounds(((w/2)-150),((h/2)-150),300,300);
		jp.add(jp2);
		jp2.setBackground(Color.white);
														//jp2.setLocationRelativeTo(null);
														//WRONG IMPLEMENTATION . ITS A METHOD OF FRAME CLASS.
		
		jl1 = new JLabel("Enter fully qualified java class name:");
		jl1.setBounds(10,10,280,50);
		jp2.add(jl1);
		jl1.setFont(new Font("Cosmic Sans MS", Font.BOLD, 14));
		
		jl2 = new JLabel("(E.g. java.awt.Frame)");
		jl2.setBounds(70,40,200,30);
		jp2.add(jl2);
		jl2.setFont(new Font("Cosmic Sans MS", Font.BOLD, 12));
		
		tf1 = new JTextField("");
		tf1.setBounds(10,90,200,30);
		jp2.add(tf1);
		
		jb1=new JButton("Submit");
		jb1.setBounds(70,130,100,20);
		jp2.add(jb1);
		jb1.setFont(new Font("Cosmic Sans MS", Font.BOLD, 12));
		jb1.addActionListener(new ButtonClick(this));
														
		jp2.setLayout(null);
		jp.setLayout(null);
		jf.setLayout(null);
		jf.setVisible(true);
		jp.setVisible(true);
		jp2.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[])
	{
		ReflectionApp r = new ReflectionApp();
	}
}

class ButtonClick implements ActionListener
{
	ReflectionApp t;
	int w,h;
	JTextArea jp1 = new JTextArea();
	JTextArea jp2 = new JTextArea();
	JTextArea jp3 = new JTextArea();
	JTextArea jp4 = new JTextArea();
	JTextArea jp5 = new JTextArea();
	JScrollPane sp=new JScrollPane();  
	
	ButtonClick(ReflectionApp t)
	{
		this.t=t;
		w=t.w;
		h=t.h;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		t.jf.remove(t.jp2);
		//SwingUtilities.updateComponentTreeUI(t.jf);	//for refreshing Jframe NOT USED OUTDATED
		t.jf.repaint();			//ALTERNATIVE
		
		jp1.setBounds(30,20,((w-80)/3),((h-50)/2));
		t.jp.add(jp1);
		jp1.setBackground(Color.green);
		sp.setBounds((((w-80)/3)+20),20,10,((h-50)/2));
		jp1.add(sp);
		
		jp2.setBounds(((w-80)/3 + 40),20,((w-80)/3),((h-50)/2));
		t.jp.add(jp2);
		jp2.setBackground(Color.yellow);
		
		jp3.setBounds(((2*((w-80)/3)) + 50),20,((w-80)/3),((h-50)/2));
		t.jp.add(jp3);
		jp3.setBackground(Color.blue);
		
		jp4.setBounds((w + 130)/6,((h+10)/2),((w-80)/3),((h-50)/2));
		t.jp.add(jp4);
		jp4.setBackground(Color.pink);
		
		jp5.setBounds((3*w - 20)/6,(h+10)/2,(w-80)/3,(h-50)/2);
		t.jp.add(jp5);
		jp5.setBackground(Color.orange);
		
		
	}	
}	


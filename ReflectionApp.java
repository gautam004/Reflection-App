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
	ReflectionApp()
	{
		
		jf=new JFrame("REFLECTION-APP");
		
		Toolkit t =jf.getToolkit();
		Dimension screenSize = t.getScreenSize();
		int w=screenSize.width;
		int h=screenSize.height;
		
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


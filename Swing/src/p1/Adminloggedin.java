package p1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Adminloggedin extends JFrame
{

	private JButton b1,b2,b3,b4;

	public Adminloggedin() 
	{
		
	b1=new JButton("Add");
	b2=new JButton("Edit");
	b3=new JButton("Search");
	b4=new JButton("Delete");

	Container c=getContentPane();
	c.setLayout(new GridLayout(2, 2));
	
	c.add(b1);
	c.add(b2);
	c.add(b3);
	c.add(b4);
	
	setSize(700,500);
	setLocation(600,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setVisible(true);
	
	}
}

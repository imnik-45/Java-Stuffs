package p1;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class user extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JLabel l1,l2;
	private JButton login,clear;
	private JTextField t1;
	private JPasswordField p1;
	
	user()
	{
	super("Operator Login");
	Font f=new Font("Comic Sans MS",Font.BOLD,25);
	
	l1=new JLabel("Enter UID => ");
	l1.setFont(f);
	t1=new JTextField();
	
	l2=new JLabel("Enter Password => ");
	l2.setFont(f);
	p1=new JPasswordField();
	
	login=new JButton("Login");
	login.setFont(f);
	
	login.addActionListener((e)->
	{
		JOptionPane.showMessageDialog(this,"next frame is not available");
	
	});
	
	clear=new JButton("Clear");
	clear.setFont(f);
	clear.addActionListener((e)->
	{
		this.dispose();
		new user();
	});
			
	
	Container c=getContentPane();
	c.setLayout(new GridLayout(3, 2));
	
	c.add(l1);
	c.add(t1);
	c.add(l2);
	c.add(p1);
	c.add(login);
	c.add(clear);
	
	setSize(700, 400);
	setLocation(600, 600);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }
}


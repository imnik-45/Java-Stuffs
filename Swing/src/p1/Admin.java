package p1;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Admin extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JLabel l1,l2;
    private JTextField t1;
    private JPasswordField p1;
	private JButton b1,b2;
	
	
	Admin()
	{
		super("Admin Login");
		
		Font f=new Font("Comic Sans MS",Font.BOLD,25);
		
		l1=new JLabel("enter the admin uid =>");
		l1.setFont(f);
		t1=new JTextField();
		t1.setFont(f);
		
		
		l2=new JLabel("enter the passwpord=>");
		l2.setFont(f);
		p1=new JPasswordField();
		p1.setFont(f);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4, 2));
		
		b1=new JButton("login");
		b2=new JButton("clear");
		
		b1.addActionListener((e) ->
		{
			if(t1.getText().equalsIgnoreCase("admin")&& p1.getText().equalsIgnoreCase("admin") )
			 
				{
				JOptionPane.showMessageDialog(this, "Successful login welcome");
			  
				new Adminloggedin();
				}
			
			else
			  JOptionPane.showMessageDialog(this,"Login Failed..!! please re-enter your details");
			
		});
		
		b2.addActionListener((e) ->
		{
			this.dispose();
			new Admin();
		});
		
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(p1);
		c.add(b1);
		c.add(b2);
		
		setSize(700,400);
		setLocation(400, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}


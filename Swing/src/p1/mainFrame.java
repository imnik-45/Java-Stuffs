package p1;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


class login extends JFrame
{
      private 	JButton bAdmin,bOperator;
	login()
	{
	    super("Login");
	
	    Font f=new Font("Comic Sans MS",Font.BOLD,25);
	    
	    bAdmin=new JButton("Admin");
	    bOperator=new JButton("Operator");
	    bAdmin.setFont(f);
        bOperator.setFont(f);	
        
        bAdmin.addActionListener((e) ->
        {
        	new Admin();
        	
        });
        
        bOperator.addActionListener((e)->
        {
        	new user();
        });
	    
	    
	   Container c=getContentPane();
	   c.setLayout(new GridLayout(1, 2));
	   
	   c.add(bOperator);
	   c.add(bAdmin);
	   
	   
	   setSize(400, 200);
	   setLocation(600, 600);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setVisible(true);
    }
}
public class mainFrame {

	public static void main(String[] args) {
		
new login();
	}

}

package simpleMinds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class simpleMinds extends JFrame implements ActionListener {
	
	JButton b1,b2;
	JTextField t1;
	
	simpleMinds(){
		setBounds(200,200,1200,500);
		getContentPane().setBackground(Color.WHITE);
		setLayout (null);
		
		//------------------------------------------------------------------------//
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("simpleMinds/Icons/login.jpeg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0, 0, 600, 500);
		add(l1);
		
		//------------------------------------------------------------------------//
		
		JLabel l2=new JLabel("G-Quiz");
		l2.setFont(new Font ("Gobold Light", Font.BOLD, 50));
		l2.setForeground(new Color(30,144,254));
		l2.setBounds(830, 30, 800, 100);
		add(l2);
		//------------------------------------------------------------------------//
		
		JLabel l3 = new JLabel ("Enter Your Name");
		l3.setFont(new Font ("lucon", Font.BOLD,18));
		l3.setForeground(new Color(30,144,254));
		l3.setBounds(835, 120, 800, 100);
		add(l3);
		
		//------------------------------------------------------------------------//
		
		t1 = new JTextField ();
		t1.setBounds(760,190,300,25);
		t1.setFont(new Font("Times new Roman", Font.BOLD,20));
		add(t1);
		
		//------------------------------------------------------------------------//
		
		b1 = new JButton("Rules");
		b1.setBounds(760, 240, 120, 25);
		b1.setBackground(new Color(30,144,254));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add (b1);
		
		//------------------------------------------------------------------------//
		
		b2 =new JButton ("Exit Quiz");
		b2.setBounds(940, 240, 120, 25);
		b2.setBackground(new Color(30,144,254));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add (b2);
		
		//------------------------------------------------------------------------//
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			String name = t1.getText();
			this.setVisible(false);
			new Rules(name);
		}else {
			System.exit(0);
			}
		}
	
	
	//------------------------------------------------------------------------//

	
	public static void main(String[] args) {
		new simpleMinds();
	}
}

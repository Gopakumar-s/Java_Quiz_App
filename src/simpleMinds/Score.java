package simpleMinds;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class Score extends JFrame implements ActionListener{
	Score (String username, int score){
		setBounds(450,150,750,500);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("simpleMinds/Icons/score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel (i3);
		l1.setBounds(0, 200, 300, 250);
		add(l1);
		
		JLabel l2= new JLabel ("Thank you "+ username+" for Playing G-Quiz!");
		l2.setBounds(45, 45, 700, 50);
		l2.setFont(new Font("Melora", Font.BOLD, 30));
		l2.setForeground(new Color (186, 29, 191));
		add(l2);
		
		JLabel l3 = new JLabel ("Your Score is : "+score);
		l3.setBounds(350,200,300,30);
		l3.setFont(new Font("Jokerman",Font.BOLD, 30));
		l3.setForeground(Color.BLUE);
		add(l3);
		
		JButton b1=new JButton ("Play Again");
		b1.addActionListener(this);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setBounds(400,270,120,30);
		add(b1);		
	}
	public void actionPerformed (ActionEvent ae) {
		this.setVisible(false);
		new simpleMinds().setVisible(true);
	}
public static void main(String[] args) {
	new Score("", 0).setVisible(true);
}
}

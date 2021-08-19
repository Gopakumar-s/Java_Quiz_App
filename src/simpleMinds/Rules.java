package simpleMinds;
import javax.swing.*;
import java.awt.*;

public class Rules extends JFrame{
	
	Rules(String username){
		setBounds(450,100,800,650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel l1=new JLabel("Welcome  "+username+"  to G-Quiz");
		l1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		l1.setForeground(Color.RED);
		l1.setBounds(50,20,700,30);
		add (l1);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Rules("");
	}

}

package simpleMinds;
import java.awt.*;
import javax.swing.*;


public class Quiz extends JFrame {
	
	Quiz(){
		setBounds (250,50,1440,950);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simpleMinds/Icons/quiz.jpg"));
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,1440,392);
		add(l1);
		
		
	}
public static void main(String[] args) {
	new Quiz().setVisible(true);
}
}

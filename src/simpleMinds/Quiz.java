package simpleMinds;
import java.awt.*;
import javax.swing.*;


public class Quiz extends JFrame {
	
	JButton next, lifeLine, submit;
	JLabel Qnum, question;
	
	Quiz(){
		setBounds (250,50,1000,650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simpleMinds/Icons/quiz.jpg"));
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,1000,272);
		add(l1);
		
		Qnum = new JLabel ("1.");
		Qnum.setFont(new Font("Arial", Font.PLAIN,18));
		Qnum.setBounds(100, 300, 40, 30);
		add(Qnum);
		
		question = new JLabel ("What is your name?");
		question.setFont(new Font("Arial", Font.PLAIN, 18));
		question.setBounds(150, 300, 700, 30);
		add(question);
		
		JRadioButton opt1=new JRadioButton("code");
		opt1.setFont(new Font("Arial", Font.PLAIN,15));
		opt1.setBackground(Color.WHITE);
		opt1.setBounds(170, 380, 400, 30);
		add(opt1);
		
		JRadioButton opt2 = new JRadioButton ("for");
		opt2.setFont(new Font("Arial", Font.PLAIN, 15));
		opt2.setBackground(Color.WHITE);
		opt2.setBounds(170, 420, 400, 30);
		add(opt2);
		
		JRadioButton opt3 = new JRadioButton ("interview");
		opt3.setFont(new Font("Arial", Font.PLAIN, 15));
		opt3.setBackground(Color.WHITE);
		opt3.setBounds(170,460,400,30);
		add(opt3);
		
		JRadioButton opt4=new JRadioButton ("For All");
		opt4.setFont(new Font("Arial", Font.PLAIN, 15));
		opt4.setBackground(Color.WHITE);
		opt4.setBounds(170, 500, 400, 30);
		add (opt4);
		
		ButtonGroup options = new ButtonGroup();
		options.add(opt1);
		options.add(opt2);
		options.add(opt3);
		options.add(opt4);
		
		lifeLine = new JButton ("50-50 LifeLine");
		lifeLine.setBounds(700, 450, 200, 30);
		lifeLine.setBackground(new Color(30,144,255));
		lifeLine.setForeground(Color.WHITE);
		lifeLine.setFont(new Font("Tahoma", Font.BOLD,14));
		add(lifeLine);
		
		submit = new JButton ("Submit");
		submit.setBounds(700, 500, 200,30);
		submit.setBackground(new Color(30,144,255));
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Tahoma", Font.BOLD,14));
		add(submit);
		
		next = new JButton ("Next");
		next.setBounds(700, 550, 200, 30);
		next.setBackground(new Color(30,144,255));
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(next);
		
	}
public static void main(String[] args) {
	new Quiz().setVisible(true);
}
}

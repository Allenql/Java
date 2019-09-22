package practice1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Practice1 extends JFrame {
	public Practice1(){
		
		this.setSize(300, 200);
		this.setLocation(300, 300);
		this.setTitle("欢迎登陆");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel jp = new JPanel(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT,30,10));
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT,30,10));
		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT,30,10));
		

		
		JPanel jp4 = new JPanel();
		jp.add(jp1,BorderLayout.NORTH);
		jp1.add(jp4);
		JPanel jp5 = new JPanel();
		jp.add(jp2,BorderLayout.CENTER);
		jp2.add(jp5);
		JPanel jp6 = new JPanel();
		jp.add(jp3,BorderLayout.SOUTH);
		jp3.add(jp6);
		
		
		JLabel userNameLable = new JLabel("用户名:");
		JTextField userNameText = new JTextField(15);
		jp4.add(userNameLable);
		jp4.add(userNameText);
		
		JLabel passWordLable = new JLabel("密     码:");
		JPasswordField passWordField = new JPasswordField(15);
		jp5.add(passWordLable);
		jp5.add(passWordField);
		
		JButton button1 = new JButton("登录");
		JButton button2 = new JButton("注册");
		jp6.add(button1);
		jp6.add(button2);
		
		this.add(jp);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new  Practice1();
	}

}

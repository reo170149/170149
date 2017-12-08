import javax.swing.*;
import java.awt.*;
public class UserReg extends JFrame{
	UserReg(String title){
		setTitle(title);
		setBounds(400,400,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2));

		JLabel label1 = new JLabel("mail");
		JLabel label2 = new JLabel("password");

		JTextField text1 = new JTextField(10);

		JPasswordField pass = new JPasswordField(10);

		p.add(label1);
		p.add(text1);
		p.add(label2);
		p.add(pass);
		Container cp = getContentPane();
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		UserReg frame = new UserReg("windou");
		frame.setVisible(true);
	}
}

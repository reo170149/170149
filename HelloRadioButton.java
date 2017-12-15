//ラジオボタン３つ、ボタン１つ、ラベル１つ
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJRadioButton extends JFrame{
	//data
	private JLabel label;
	private JRadioButton rbton1;
	private JRadioButton rbton2;
	private JRadioButton rbton3;

	//method
	HelloJRadioButton(String title){
		setTitle(title);
		setBounds(400,400,400,400);
		//setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.rbtn1 = new JRadioButton("A");
		this.rbtn2 = new JRadioButton("B");
		this.rbtn3 = new JRadioButton("C");

		JButton btn = new JButton("click me");

		this.label = new JLabel("this is a label");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(btn);
		panel.add(this.label);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		HelloJRadioButton frame = new HelloJRadioButton("ALOHA");
		frame.setVisible(true);		
	}
}
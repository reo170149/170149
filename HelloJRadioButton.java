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

public class HelloJRadioButton extends JFrame implements ActionListener{
	//data
	private JLabel label;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;

	//method
	public void actionPerformed(ActionEvent e){
		//ラジオボタンが選択されているか、調べる
		Boolean kekka1 = this.rbtn1.isSelected();
		Boolean kekka2 = this.rbtn2.isSelected();
		Boolean kekka3 = this.rbtn3.isSelected();
		
		//調べた結果を、ラベルに書き込む
		String msg = "";
		if(kekka1){
			msg = this.rbtn1.getText()+"が選択されています。";
			this.label.setText(msg);
		}
		if(kekka2){
			msg = this.rbtn2.getText()+"が選択されています。";
			this.label.setText(msg);
		}
		if(kekka3){
			msg = this.rbtn3.getText()+"が選択されています。";
			this.label.setText(msg);
		}
	}

	HelloJRadioButton(String title){
		setTitle(title);
		setBounds(400,400,400,400);
		//setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JRadioButton
		this.rbtn1 = new JRadioButton("A");
		this.rbtn2 = new JRadioButton("B");
		this.rbtn3 = new JRadioButton("C");

		//ButtonGroup
		ButtonGroup rBtnGroup = new ButtonGroup();
		rBtnGroup.add(this.rbtn1);
		rBtnGroup.add(this.rbtn2);
		rBtnGroup.add(this.rbtn3);


		JButton btn = new JButton("click me");
		btn.addActionListener(this);

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
	//main
	public static void main(String[] args){
		HelloJRadioButton frame = new HelloJRadioButton("ALOHA");
		frame.setVisible(true);
	}
}
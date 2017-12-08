import javax.swing.*;
import java.awt.*;
public class TestChekBox extends JFrame{
	TestChekBox(String title){
		setTitle(title);
		setBounds(400,400,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JChekBox check1 = new JChekBox("A");
		JChekBox check2 = new JChekBox("B");
		JChekBox check3 = new JChekBox("C");

		p.add(check1);
		p.add(check2);
		p.add(check3);

		Container cp = getContentPane();
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		TestChekBox tx = new TestChekBox("window");
		tx.setVisible(true);
	}
}
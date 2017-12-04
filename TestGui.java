import javax.swing.*;
import java.awt.*;
public class TestGui extends JFrame{
	TestGui(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		JTextField field = new JTextField("",10);
		JPasswordField jpf = new JPasswordField("ALOHA");
		pnl.add(field,BorderLayout.NORTH);
		pnl.add(jpf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		TestGui test = new TestGui("ALOHA");
		test.setVisible(true);
	}
}

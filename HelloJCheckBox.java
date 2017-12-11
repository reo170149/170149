import javax.swing.*;
import java.awt.*;
public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setBounds(400,400,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JCheckBox check1 = new JCheckBox("A");
		JCheckBox check2 = new JCheckBox("B");
		JCheckBox check3 = new JCheckBox("C");
		p.add(check1);
		p.add(check2);
		p.add(check3);

		Container cp = getContentPane();
	
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		HelloJCheckBox jb = new HelloJCheckBox("window");
		jb.setVisible(true);	
	}
}
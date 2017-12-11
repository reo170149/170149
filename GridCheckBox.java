import javax.swing.*;
import java.awt.*;
public class GridCheckBox extends JFrame{
	GridCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		//縦にCheckBox表示
		p.setLayout(new GridLayout(3,1));

		JCheckBox cb1 = new JCheckBox("A");//("A",true)にするとチェックされた状態で起動
		JCheckBox cb2 = new JCheckBox("B");
		JCheckBox cb3 = new JCheckBox("C");

		p.add(cb1);
		p.add(cb2);
		p.add(cb3);

		Container cp = getContentPane();
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		GridCheckBox gcb = new GridCheckBox("window");
		gcb.setVisible(true);
	}
}
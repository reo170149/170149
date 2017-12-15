import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fukushu extends JFrame implements ActionListener{
	private JLabel lbl;
	private JCheckBox check;

	public static void main(String[] args){
		Fukushu frame = new Fukushu("window");
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(this.check.isSelected()){
			this.lbl.setText(this.check.getText()+"が選択されてます。");
		}else{
			this.lbl.setText("何も選択されてません。");
		}
	}
	Fukushu(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.check = new JCheckBox("A");

		this.lbl = new JLabel("test");

		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JButton btn = new JButton("Click!");
		btn.addActionListener(this);

		pnl1.add(check);
		pnl1.add(this.lbl);
		pnl2.add(btn);

		Container cp = getContentPane();
		cp.add(pnl1,BorderLayout.NORTH);
		cp.add(pnl2,BorderLayout.SOUTH);
	}
}

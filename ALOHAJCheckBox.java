import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ALOHAJCheckBox extends JFrame implements ActionListener{
	JCheckBox[] check;
	JLabel[] lbl;

	public static void main(String[] args){
		ALOHAJCheckBox frame = new ALOHAJCheckBox("window");
		frame.setVisible(true);
	}
	ALOHAJCheckBox(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		//setSize(500,500);
		//setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		this.check = new JCheckBox[3];
		this.check[0] = new JCheckBox("A");
		this.check[1] = new JCheckBox("B");
		this.check[2] = new JCheckBox("C");

		this.lbl = new JLabel[3];
		this.lbl[0] = new JLabel();
		this.lbl[1] = new JLabel();
		this.lbl[2] = new JLabel();
		
		JPanel pnl = new JPanel();
		
		pnl.setLayout(new GridLayout(4,2));
		
		for(int i = 0; i<3; i++){
			pnl.add(this.check[i]);
			pnl.add(this.lbl[i]);
		}

		JButton button = new JButton("OK");
		button.addActionListener(this);
		
		pnl.add(button);
		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
		
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK!!");
		for(int i=0; i<3; i++){
			if(this.check[i].isSelected()){
				this.lbl[i].setText(this.check[i].getText()+"check");
			}else{
				this.lbl[i].setText("");
			}
		}
	}
}
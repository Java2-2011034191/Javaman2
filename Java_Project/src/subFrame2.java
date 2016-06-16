package SW_TEST;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;

public class subFrame2 extends JFrame implements ActionListener {
	
	private JRadioButton first = new JRadioButton("First");
	private JRadioButton second = new JRadioButton("Second");
	private JRadioButton third = new JRadioButton("Third");
	private JLabel subLabel;
	
	ButtonGroup group = new ButtonGroup();
	
	public subFrame2() {
		group.add(first);
		first.addActionListener(this);
		group.add(second);
		second.addActionListener(this);
		group.add(third);
		third.addActionListener(this);
		
		setTitle("subFrame2 : " + String.valueOf(MainFrame.frameCnt));
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(2,1));
		JPanel upperpanel = new JPanel();
		JPanel panel0 = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel lowerpanel = new JPanel();
		subLabel = new JLabel();
		subLabel.setText("Select Radio Button");
		
		panel0.add(first);
		panel1.add(second);
		panel2.add(third);
		
		upperpanel.add(panel0);
		upperpanel.add(panel1);
		upperpanel.add(panel2);
		lowerpanel.add(subLabel);
		mainpanel.add(upperpanel);
		mainpanel.add(lowerpanel);
		add(mainpanel);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		subFrame.cmdCnt++;
		// TODO Auto-generated method stub
		if (e.getSource() == first) {
		} else if (e.getSource() == second) {
			
		} else if (e.getSource() == third) {
			
		}
	}

}

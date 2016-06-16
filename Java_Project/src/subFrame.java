package SW_TEST;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.*;

public class subFrame extends JFrame implements ActionListener {

	private JButton str1Btn;
	private JButton str2Btn;
	private JLabel label;
	private JTextArea txtArea;
	static int subFrame2cnt = 0;
//	static int frameCnt = 0;
	static int cmdCnt = 0;

	public subFrame() {

		setTitle("subFrame : " + String.valueOf(MainFrame.subFrameNo));
		setSize(1300, 220);
		setBounds(100, 100, 1300, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel mainpanel = new JPanel();
		JPanel panel0 = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		str1Btn = new JButton("String1 : One command and make re_subFrame");
		str1Btn.addActionListener(this);
		str2Btn = new JButton("String2 : Two command");
		str2Btn.addActionListener(this);
		label = new JLabel("subFrame and command");
		txtArea = new JTextArea();
		txtArea.setRows(10);
		txtArea.setColumns(50);

		panel0.add(str1Btn);
		panel1.add(str2Btn);
		panel2.add(label);
		panel3.add(txtArea);

		mainpanel.add(panel0);
		mainpanel.add(panel1);
		mainpanel.add(panel2);
		mainpanel.add(panel3);
		add(mainpanel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == str1Btn) {
			// Add Subframe
			MainFrame.frameCnt++;
			cmdCnt++;
			txtArea.append("make String1 : " + "(Frame Count : "
					+ String.valueOf(MainFrame.frameCnt) + "), (Command Counter : " + String.valueOf(cmdCnt) + ")\n");
			Frame sF2 = new subFrame2();
			sF2.setVisible(true);
		} else if (e.getSource() == str2Btn) {
			cmdCnt++;
			txtArea.append("make String2 : " + "(Command Counter : "
					+ String.valueOf(cmdCnt) + "),\n");
		}

	}

	public static void main(String[] args) {
		new subFrame();
	}

}

package SW_TEST;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {

	static int frameCnt = 0;
	private JButton OKbtn;
	private JButton Canclebtn;
	private JLabel okLabel;
	private JLabel cancleLabel;
	static int subFrameNo = 0;
	public int rand;

	public MainFrame() {
		setTitle("Main Frame");
		setSize(600, 80);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel mainpanel = new JPanel();
		JPanel panel0 = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		okLabel = new JLabel("Final-Test, To Make new frame test");
		cancleLabel = new JLabel("Make New Frame");
		OKbtn = new JButton("OKay");
		OKbtn.addActionListener(this);
		Canclebtn = new JButton("Cancel");
		Canclebtn.addActionListener(this);
		panel0.add(okLabel);
		panel1.add(OKbtn);
		panel2.add(Canclebtn);
		panel3.add(cancleLabel);

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
		if (e.getSource() == OKbtn) {
			okLabel.setText("subframe : " + String.valueOf(frameCnt));
			Frame sF = new subFrame();
			sF.setVisible(true);
			frameCnt++;
		} else if (e.getSource() == Canclebtn) {
			cancleLabel.setText("Don't make frame");
		}

	}

	public static void main(String[] args) {
		new MainFrame();
	}
}

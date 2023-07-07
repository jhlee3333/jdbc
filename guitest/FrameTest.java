package guitest;

import java.awt.Frame;

import javax.swing.JFrame;

public class FrameTest extends Frame {
	
	public FrameTest() {
		
		setTitle("결제가 완료되었습니다.");
		setBounds(150, 150, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrame();
	}

}

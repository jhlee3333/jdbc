package guitest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class TextArea1 extends Frame{

	public TextArea1(String str) {
		super(str);
		Panel p = new Panel();
		TextArea txt1 = new TextArea(10, 30);
		TextField txt2 = new TextField("결제되었습니다.", 20);
		txt1.setText("결제 완료");
		
		txt1.setBackground(Color.cyan);
		txt1.setFont(new Font("고딕체", Font.BOLD, 10));
		txt1.setForeground(Color.black);
		txt2.setEchoChar('@');
		txt2.setForeground(Color.white);
		p.add(txt1);
		p.add(txt2);
		add(p);
		setSize(100, 300);
		setVisible(true);
	}

}

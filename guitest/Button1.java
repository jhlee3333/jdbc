package guitest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Button1 extends Frame {
	
	Button btn1, btn2, btn3;
	
	public Button1(String str) {
		super(str);
		Panel p = new Panel();
		btn1 = new Button("A");
		btn2 = new Button("B");
		btn3 = new Button("C");
		p.add(btn1); p.add(btn2); p.add(btn3);
		add(p);
		
		btn3.setEnabled(false);
		setSize(200, 200);
		setVisible(true);
	}

}

package guitest;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class TextField1 extends Frame {

	public TextField1(String str) {
		super(str);
		Panel p = new Panel();
		Label lbl1 = new Label("ID");
		Label lbl2 = new Label("PASSWORD");
		
		TextField txt1 = new TextField("ID", 20);
		TextField txt2 = new TextField(20);
		
		txt2.setEchoChar('*');
		p.add(lbl1);
		p.add(txt1);
		p.add(lbl2);
		p.add(txt2);
		add(p);
		setSize(200, 200);
		setVisible(true);
		
	}

}

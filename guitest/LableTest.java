package guitest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class LableTest extends Frame {
	
	Panel p;
	Label label1, label2, label3;
	
	public LableTest(String str) {
		super(str);
		p = new Panel();
		label1 = new Label("치킨");
		label2 = new Label("피자", Label.CENTER);
		label3 = new Label("종로", Label.LEFT);
		
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		
		p.add(label1); p.add(label2); p.add(label3);
		add(p);
		setSize(300, 300);
		setVisible(true);
	}

}

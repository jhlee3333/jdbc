package guitest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest extends Frame {

	public PanelTest(String str) {
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.red);
		add(panel1);
		setSize(500, 500);
		setVisible(true);
	}

}

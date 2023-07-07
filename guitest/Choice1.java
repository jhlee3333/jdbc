package guitest;

import java.awt.Choice;
import java.awt.Frame;

public class Choice1 extends Frame {
	
	Choice ch;
	
	public Choice1(String str) {
		super(str);
		ch = new Choice();
		ch.addItem("치킨");
		ch.addItem("피자");
		ch.addItem("햄버거");
		
		add(ch);
		setSize(300, 100);
		setVisible(true);
	}
	
}

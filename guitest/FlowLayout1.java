package guitest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout1 extends Frame {
	
	FlowLayout f = new FlowLayout();
	Button btn[] = new Button[10];
	
	public FlowLayout1(String str) {
		super(str);
		setLayout(f);
		for(int i=0; i<10; i++) {
			btn[i] = new Button((i+1)+"1번 버튼");
			add(btn[i]);
		}
		setBounds(200, 200, 400, 400);
		setVisible(true);
	}

}

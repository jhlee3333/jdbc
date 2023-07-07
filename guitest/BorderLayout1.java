package guitest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout1 extends Frame {

	public BorderLayout1(String str) {
		super(str);
		setLayout(new BorderLayout());
		add("만화", new Button("만화"));
		add("19+", new Button("19+"));
		add("인문학", new Button("인문학"));
		add("소설", new Button("소설"));
		add("자기 계발", new Button("자기 계발"));
		
		setSize(300, 300);
		setVisible(true);
	}

}

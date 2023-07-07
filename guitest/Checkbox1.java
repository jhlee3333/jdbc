package guitest;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Checkbox1 extends Frame {
	
	public Checkbox1(String str) {
		super(str);
		Panel p = new Panel();
		Checkbox cbx1 = new Checkbox("치킨", true);
		Checkbox cbx2 = new Checkbox("피자");
		Checkbox cbx3 = new Checkbox("햄버거");
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4 = new Checkbox("치킨", group, true);
		Checkbox cbx5 = new Checkbox("피자", group, false);
		Checkbox cbx6 = new Checkbox("햄버거", group, false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);
		
		add(p);
		setSize(180, 300);
		setVisible(true);
	}

}

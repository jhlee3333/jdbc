package guitest;

import java.awt.Dialog;
import java.awt.Frame;

public class ModelessDialog extends Frame {

	public ModelessDialog() {
		super("다이얼로그 테스트");
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		setBounds(0, 0, 400, 400);
		setVisible(true);
		d.setSize(200, 200);
		d.setVisible(true);
	}

}

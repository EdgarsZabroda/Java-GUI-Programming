package indept.dialog.coding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainWindowKeyListener implements ActionListener
{
	private JFrame jFrame;
	
	public MainWindowKeyListener(JFrame jFrame)
	{
		this.jFrame = jFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent E)
	{
		TheDialog td = new TheDialog(this.jFrame, true);
		td.setSize(256, 128);
	}
}

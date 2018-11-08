package indept.dialog.coding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextPopupListener implements ActionListener
{
	private JTextField sMessage;
	private JDialog jdParent;
	
	public TextPopupListener(JDialog jdParent, JTextField sMessage)
	{
		this.sMessage = sMessage;
		this.jdParent = jdParent;
	}
	
	@Override
	public void actionPerformed(ActionEvent a)
	{
		JOptionPane.showMessageDialog(jdParent, sMessage.getText(), "Your text was", JOptionPane.INFORMATION_MESSAGE);
	}
}
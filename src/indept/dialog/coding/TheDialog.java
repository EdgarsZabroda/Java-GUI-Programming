package indept.dialog.coding;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TheDialog extends JDialog
{
	private static final long serialVersionUID = 0xDEADBEA7L;
	
	public TheDialog(Frame Parent, boolean bModal)
	{
		super(Parent, bModal);
		setTitle("Text printer");
		Point point = new Point(384, 384);
		setLocation(point.x, point.y);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel jlYourText = new JLabel("Your text:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.insets = new Insets(8, 10, 0, 0);
		jPanel.add(jlYourText, gbc);
		
		JTextField jtfMessage = new JTextField(10);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		jPanel.add(jtfMessage, gbc);
		
		JButton jbEcho = new JButton("Out text");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		jPanel.add(jbEcho, gbc);
		jbEcho.addActionListener(new TextPopupListener(this, jtfMessage));
		
		getContentPane().add(jPanel, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
}

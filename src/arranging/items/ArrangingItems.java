package arranging.items;


import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class ArrangingItems extends JFrame
{
	private static final long serialVersionUID = 0x7FEEDDCCL;
	
	public ArrangingItems()
	{
		setTitle("Aranging items");
		setSize(256, 256);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		setVisible(true);
		
		JLabel jlOne = new JLabel("This");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(8, 10, 0, 0);
		jPanel.add(jlOne, gbc);
		JLabel jlTwo = new JLabel("is");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.WEST;
		jPanel.add(jlTwo, gbc);
		JLabel jlThree = new JLabel("manually");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		jPanel.add(jlThree, gbc);
		JLabel jlFour = new JLabel("aligned");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		jPanel.add(jlFour, gbc);
		
		getContentPane().add(jPanel, BorderLayout.NORTH);
	}
	
	public static void gui()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymph.NympLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] Args)
	{
		ArrangingItems ai = new ArrangingItems();
	}
}
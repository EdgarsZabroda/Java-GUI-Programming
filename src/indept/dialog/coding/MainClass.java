package indept.dialog.coding;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainClass extends JFrame
{
	private static final long serialVersionUID = 0xDEADBEA7L;
	
	public MainClass()
	{
		setTitle("Indepth dialog coding");
		setSize(256, 128);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbDialog = new JButton("Open Dialog");
		jbDialog.addActionListener(new MainWindowKeyListener(this));
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		jPanel.add(jbDialog);
		
		add(jPanel);
	}
	
	public static void GUI()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymph.NymphLookAndFeel");
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		MainClass mc = new MainClass();
	}
}
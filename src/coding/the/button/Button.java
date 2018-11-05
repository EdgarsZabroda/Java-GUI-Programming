package coding.the.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Button extends JFrame
{
	private static final long serialVersionUID = 0xFFEEDDCCBBL;
	
	public Button()
	{
		setTitle("Button tutorial");
		setSize(320, 256);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbPushMe = new JButton("Push me!");
		jbPushMe.addActionListener(new PushMe());
		
		JPanel jPanel = new JPanel();
		
		setVisible(true);
		jPanel.add(jbPushMe);
		
		add(jPanel);
		repaint();
	}
	
	private static class PushMe extends JFrame implements ActionListener
	{
		private static final long serialVersionUID = 0xFFEEDDCCBBL;
		
		public void actionPerformed(ActionEvent ae)
		{
			setTitle("You clicked me!");
			setSize(256, 128);
			setVisible(true);
			setResizable(false);
			
			JLabel jlHi = new JLabel("You clicked me!!!");
			JPanel jPanel = new JPanel();
			
			jPanel.add(jlHi);
			
			add(jPanel);
		}
	}
	
	public static void gui()
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
		Button b = new Button();
	}
}
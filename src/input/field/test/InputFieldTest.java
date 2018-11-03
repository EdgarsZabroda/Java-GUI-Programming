package input.field.test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class InputFieldTest extends JFrame
{
	private static final long serialVersionUID = 0xDEADD0BE;
	
	public InputFieldTest()
	{
		setTitle("Input Fields Test");
		setSize(768, 512);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jUser = new JLabel("User:");
		JLabel jSignature = new JLabel("Secret signature:");
		JLabel jShout = new JLabel("Shout:");
		
		JTextField jtUser = new JTextField(8);
		JPasswordField jpSignature = new JPasswordField(8);
		JTextArea jtShout = new JTextArea(8, 16);
		
		JPanel JP = new JPanel();
		setVisible(true);
		
		JP.add(jUser);
		JP.add(jtUser);
		JP.add(jSignature);
		JP.add(jpSignature);
		JP.add(jShout);
		JP.add(jtShout);
		
		add(JP);
	}
	
	public static void GNF()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nymbus.NymbusLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		InputFieldTest ift = new InputFieldTest();
		System.out.println("If you don't see the controls " +
				"resize the main window.");
	}
}
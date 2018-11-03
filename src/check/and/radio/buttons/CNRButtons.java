package check.and.radio.buttons;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class CNRButtons extends JFrame
{
	private static final long serialVersionUID = 0xDEADDEADL;
	
	public CNRButtons()
	{
		setTitle("Check and Radio buttons");
		setSize(768, 256);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlUser = new JLabel("User:");
		JLabel jlPassword = new JLabel("Password:");
		JLabel jlComment = new JLabel("Comment:");
		JTextField jtfUser = new JTextField(15);
		JPasswordField jpfPassword = new JPasswordField(15);
		JTextArea jtaComment = new JTextArea(5, 15);
		JScrollPane jspCommentScroll = new JScrollPane(
				jtaComment, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JButton jbPost = new JButton("Post");
		JCheckBox jcbPostAnonymous = new JCheckBox(
				"Post as anonymous", null);
		JLabel jlPostAs = new JLabel("Post as:");
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrbMale = new JRadioButton("Male");
		JRadioButton jrbFemale = new JRadioButton("Female");
		
		jtaComment.setLineWrap(true);
		jtaComment.setWrapStyleWord(true);
		bg.add(jrbMale);
		bg.add(jrbFemale);
		jrbMale.setSelected(true);
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		jPanel.add(jlUser);
		jPanel.add(jtfUser);
		jPanel.add(jlPassword);
		jPanel.add(jpfPassword);
		jPanel.add(jlComment);
		jPanel.add(jspCommentScroll);
		jPanel.add(jcbPostAnonymous);
		jPanel.add(jlPostAs);
		jPanel.add(jrbMale);
		jPanel.add(jrbFemale);
		jPanel.add(jbPost);
		
		add(jPanel);
	}
	
	public static void GUI()
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
		CNRButtons cnrb = new CNRButtons();
		System.out.println("If you don't see controls " +
				"try resize the window until you do.");
	}
}
package advanced.gui.projects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class AdvancedGP extends JFrame
{
	public static final long serialVersionUID = 0x11291102L;
	
	public AdvancedGP()
	{
		setTitle("Advanced GUI Projects");
		setSize(768, 256);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlUser = new JLabel("User:");
		JLabel jlPassword = new JLabel("Password:");
		JLabel jlComment = new JLabel("Comment:");
		JTextField jtfUser = new JTextField(10);
		JPasswordField jpfPassword = new JPasswordField(10);
		JTextArea jtaComment = new JTextArea(3, 10);
		
		jtaComment.setLineWrap(true);
		jtaComment.setWrapStyleWord(true);
		
		JScrollPane jspCommentScrollBars = new JScrollPane(jtaComment,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JButton jbPost = new JButton("Post");
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		jPanel.add(jlUser);
		jPanel.add(jtfUser);
		jPanel.add(jlPassword);
		jPanel.add(jpfPassword);
		jPanel.add(jlComment);
		jPanel.add(jspCommentScrollBars);
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
		AdvancedGP agp = new AdvancedGP();
		System.out.println("If controls aren't visible " +
				"try resizing the window");
	}
}
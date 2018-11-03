package combos.and.lists;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class CombosAndLists extends JFrame
{
	private static final long serialVersionUID = 0xDEADBABEL;
	
	public CombosAndLists()
	{
		setTitle("Combos and lists");
		setSize(1024, 256);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlUser = new JLabel("User:");
		JLabel jlPassword = new JLabel("Password:");
		JLabel jlComment = new JLabel("Comment:");
		JLabel jlPostAs = new JLabel("Post as:");
		JTextField jtfUser = new JTextField(10);
		JPasswordField jpfPassword = new JPasswordField(10);
		JTextArea jtaComment = new JTextArea(5, 10);
		JScrollPane jspComment = new JScrollPane(jtaComment,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JCheckBox jcbPostAsAnonymous = new JCheckBox("Post as anonymous");
		ButtonGroup bgMOF = new ButtonGroup();
		JRadioButton jrbMale = new JRadioButton("Male");
		JRadioButton jrbFemale = new JRadioButton("Female");
		JButton jbSubmit = new JButton("Submit");
		
		bgMOF.add(jrbMale);
		bgMOF.add(jrbFemale);
		jtaComment.setLineWrap(true);
		jtaComment.setWrapStyleWord(true);
		jrbMale.setSelected(true);
		
		String sStatus[] = {"Administrator", "Moderatos",
				"Simple user", "Guest"
		};
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox jcbStatus = new JComboBox(sStatus);
		
		String sTopicType[] = {"Regular", "Pinned", "Locked"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JList jlTopicType = new JList(sTopicType);
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		jPanel.add(jlUser);
		jPanel.add(jtfUser);
		jPanel.add(jlPassword);
		jPanel.add(jpfPassword);
		jPanel.add(jlComment);
		jPanel.add(jspComment);
		jPanel.add(jlPostAs);
		jPanel.add(jcbPostAsAnonymous);
		jPanel.add(jrbMale);
		jPanel.add(jrbFemale);
		jPanel.add(jcbStatus);
		jPanel.add(jlTopicType);
		jPanel.add(jbSubmit);
		
		add(jPanel);
	}
	
	public static void GUI()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymbus.NymbusLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println(E.toString());
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		CombosAndLists cal = new CombosAndLists();
		System.out.println("If controls aren't visible" +
				" resize the window until you see them.");
	}
}
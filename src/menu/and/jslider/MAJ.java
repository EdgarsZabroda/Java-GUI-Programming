package menu.and.jslider;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class MAJ extends JFrame
{
	public static final long serialVersionUID = 0xFEDBCAD9L;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public MAJ()
	{
		setTitle("Menu and JList");
		setSize(256, 512);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlName = new JLabel("User:");
		JLabel jlPassword = new JLabel("Password:");
		JLabel jlComment = new JLabel("Comment:");
		JLabel jlPostAs = new JLabel("Post as:");
		JLabel jlUserRank = new JLabel("User rank:");
		JLabel jlPriorityType = new JLabel("Topic priority:");
		JTextField jtfUser = new JTextField(10);
		JPasswordField jpfPassword = new JPasswordField(10);
		JTextArea jtaComment = new JTextArea(5, 10);
		JScrollPane jspComment = new JScrollPane(jtaComment,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JCheckBox jcbPostAsAnonymous = new JCheckBox("Post as anonymous");
		ButtonGroup bgGender = new ButtonGroup();
		JRadioButton jrbMale = new JRadioButton("Male");
		JRadioButton jrbFemale = new JRadioButton("Female");
		String sUserRank[] = {"Administrator", "Moderator",
				"User", "Guest"};
		String sPriorityType[] = {"Regular", "Pinned", "Locked"};
		JComboBox jcbUserRank = new JComboBox(sUserRank);
		JList jlPType = new JList(sPriorityType);
		JButton jbSubmit = new JButton("Submit");
		
		jtaComment.setLineWrap(true);
		jtaComment.setWrapStyleWord(true);
		bgGender.add(jrbMale);
		bgGender.add(jrbFemale);
		jrbMale.setSelected(true);
		
		JSlider jSlider = new JSlider(0, 200);
		
		jSlider.setMajorTickSpacing(100);
		jSlider.setPaintLabels(true);
		
		JMenuBar MenuBar = new JMenuBar();
		JMenu jmFileMenu = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		
		MenuBar.add(jmFileMenu);
		jmFileMenu.add(jmiOpen);
		jmFileMenu.addSeparator();
		jmFileMenu.add(jmiSave);
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		jPanel.add(MenuBar);
		jPanel.add(jlName);
		jPanel.add(jtfUser);
		jPanel.add(jlPassword);
		jPanel.add(jpfPassword);
		jPanel.add(jlComment);
		jPanel.add(jspComment);
		jPanel.add(jlPostAs);
		jPanel.add(jlPostAs);
		jPanel.add(jcbPostAsAnonymous);
		jPanel.add(jrbMale);
		jPanel.add(jrbFemale);
		jPanel.add(jlUserRank);
		jPanel.add(jcbUserRank);
		jPanel.add(jlPriorityType);
		jPanel.add(jlPType);
		jPanel.add(jbSubmit);
		jPanel.add(jSlider);
		
		add(jPanel);
	}
	
	public static void gui()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymph.NymphLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		MAJ maj = new MAJ();
		System.out.println("Resize window if you don't see " +
				"the controls");
	}
}
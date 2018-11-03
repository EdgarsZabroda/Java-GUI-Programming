package learning.the.dialogs;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class LearningTheDialogs extends JFrame
{
	public static final long serialVersionUID = 0xDEAD1337L;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public LearningTheDialogs()
	{
		System.out.println("Beginning of the constructor method");
		System.out.println("Displaying first dialog");
		JOptionPane.showInputDialog(null, "Please enter the key name:", "Key name", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Displaying second dialog");
		JOptionPane.showMessageDialog(null, "Key name accepted");
		
		System.out.println("End of dialogs");
		
		System.out.println("Creating a window and passing parameters");
		setTitle("Learning the Dialogs");
		setSize(256, 512);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println("Creating controls");
		JLabel jlKeyName = new JLabel("Key name:");
		JLabel jlKeyPassword = new JLabel("Key password:");
		JLabel jlKey = new JLabel("Key:");
		JLabel jlEncodeMethod = new JLabel("Encode method:");
		JLabel jlEncodeType = new JLabel("Encode type");
		JLabel jlAlgorithm = new JLabel("Algorithm:");
		JLabel jlKeyStrenth = new JLabel("Strenght");
		JTextField jtfKeyName = new JTextField(15);
		JPasswordField jpfKeyPassword = new JPasswordField(15);
		JTextArea jtaKey = new JTextArea(5, 15);
		JScrollPane jspKey = new JScrollPane(jtaKey,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JCheckBox jcbSingleKey = new JCheckBox("Single key");
		JRadioButton jrbOneTimePad = new JRadioButton("One time pad");
		JRadioButton jrbRepeatableKey = new JRadioButton("Repeatable key");
		String sEncodeType[] = {"Symetrical", "ASymetrical"};
		JComboBox jcbEncodeType = new JComboBox(sEncodeType);
		String sAlgorithm[] = {"X25519", "RSA", "DSA"};
		JList jlAlgo = new JList(sAlgorithm);
		JMenuBar jmbMenuBar = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiExport = new JMenuItem("Export");
		JMenuItem jmiImport = new JMenuItem("Import");
		JMenuItem jmiClose = new JMenuItem("Exit");
		ButtonGroup bgKeyType = new ButtonGroup();
		JSlider jsStrength = new JSlider(0, 1024);
		JButton jbCommit = new JButton("Commit");
		
		System.out.println("Configuring controls");
		bgKeyType.add(jrbOneTimePad);
		bgKeyType.add(jrbRepeatableKey);
		jrbOneTimePad.setSelected(true);
		jsStrength.setMajorTickSpacing(512);
		jsStrength.setPaintLabels(true);
		jmbMenuBar.add(jmFile);
		jmFile.add(jmiImport);
		jmFile.add(jmiExport);
		jmFile.addSeparator();
		jmFile.add(jmiClose);
		
		System.out.println("Creating main panel and making it visible");
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		System.out.println("Adding controls to the panel");
		jPanel.add(jmbMenuBar);
		jPanel.add(jlKeyName);
		jPanel.add(jtfKeyName);
		jPanel.add(jlKeyPassword);
		jPanel.add(jpfKeyPassword);
		jPanel.add(jlKey);
		jPanel.add(jspKey);
		jPanel.add(jlEncodeMethod);
		jPanel.add(jcbSingleKey);
		jPanel.add(jrbOneTimePad);
		jPanel.add(jrbRepeatableKey);
		jPanel.add(jlEncodeType);
		jPanel.add(jcbEncodeType);
		jPanel.add(jlAlgorithm);
		jPanel.add(jlAlgo);
		jPanel.add(jlKeyStrenth);
		jPanel.add(jsStrength);
		jPanel.add(jbCommit);
		
		System.out.println("Adding main panel to the window");
		add(jPanel);
		
		System.out.println("End of contructor method");
	}
	
	public static void guiClass()
	{
		System.out.println("Beginning of guiClass method");
		System.out.println("Normally this method is not executed and these messages are left unread");
		
		try
		{
			System.out.println("Trying to set Look and Feel");
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymph.NymphLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println("Exception occured when trying to set look and feel");
			System.out.println(E.toString());
		}
		
		System.out.println("End of guiClass method");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("Beginning of the entry point \"main\" method");
		System.out.println("Calling this class constructor by defining it");
		LearningTheDialogs ltd = new LearningTheDialogs();
		System.out.println("In this version of the class file controls should be visible and resizing of the window " +
				"is no longer required. This class was compiled with JDK 11 and if you still can't see controls contact " +
				"<-::R€NeGeTiC::-> aka Source the system owner");
		System.out.println("End of entry point \"main\" method");
	}
}
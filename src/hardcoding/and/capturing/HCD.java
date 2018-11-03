package hardcoding.and.capturing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

public class HCD extends JFrame
{
	private static final long serialVersionUID = 0x12345678L;
	
	private String GetMD5(String Password) throws NoSuchAlgorithmException
	{
		System.out.println("Beginning of the GetMD5 function");
		System.out.println("Getting MD5 in bytes");
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(Password.getBytes());
		byte Digest[] = md.digest();
		
		System.out.println("Creating new hash from bytes to String");
		
		StringBuilder sbHash = new StringBuilder();
		
		for(byte Byte : Digest)
		{
			sbHash.append(String.format("%02x", Byte));
		}
		
		String Hash = sbHash.toString();
		Hash = Hash.toUpperCase();
		
		System.out.println("New hash generated, the new hash is: " +
				Hash + ", returning new hash, end of GetMD5");
		
		return Hash;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HCD() throws InterruptedException
	{
		System.out.println("Beginning of the constructor");
		System.out.println("WARNING!!! Constructor trows Interupted exception");
		System.out.println("Creating a dialog to ask for password");
		
		String sPwd = JOptionPane.showInputDialog(null, "Enter your PIN code",
				"PIN Request", JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("Attempting to generate hash");
		
		Thread.sleep(800);
		
		try
		{
			sPwd = GetMD5(sPwd);
		}
		catch(NoSuchAlgorithmException nsae)
		{
			System.out.println("Caught NoSuchAlgorithmException!!!");
			nsae.printStackTrace();
			System.exit(-1);
		}
		
		System.out.println("Done generating hash");
		System.out.println("Comparing hashes");
		
		Thread.sleep(800);
		
		if(sPwd.equals("6D8470222CB0E9CA1519AB84406EF2B2"))
		{
			System.out.println("Hashes match, proceeding showing welcome dialog");
			JOptionPane.showMessageDialog(null, "Welcome <-::R€NeGeTiC-::>",
					"Welcome!", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			System.out.println("Hashes don't match, invalid password. "
					+ "Promting incorrect PIN dialog and exiting");
			JOptionPane.showMessageDialog(null, "Invalid PIN code, exiting",
					"Pin error!", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		System.out.println("Creating a main window");
		setTitle("Hardcoding and Capturing data");
		setSize(256, 512);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println("Creating and defining controls");
		JLabel jlKeyName = new JLabel("Key name:");
		JLabel jlKeyPassword = new JLabel("Key password:");
		JLabel jlKey = new JLabel("Key:");
		JLabel jlEncodeMethod = new JLabel("Encode method:");
		JLabel jlKeyType = new JLabel("Key type:");
		JLabel jlAlgorithm = new JLabel("Algorithm:");
		JLabel jlKeyStrength = new JLabel("Key strength:");
		JTextField jtfKeyName = new JTextField(15);
		JPasswordField jpfKeyPassword = new JPasswordField(15);
		JTextArea jtaKey = new JTextArea(5, 15);
		JScrollPane jspKey = new JScrollPane(jtaKey,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JCheckBox jcbSingleKey = new JCheckBox("Single key");
		ButtonGroup bgType = new ButtonGroup();
		JRadioButton jrbOneTimePad = new JRadioButton("One time pad");
		JRadioButton jrbRepeatableKey = new JRadioButton("Repeatable key");
		String sKeyType[] = {"Symetrical", "Asymetrical"};
		JComboBox jcbKeyType = new JComboBox(sKeyType);
		String sAlgorithm[] = {"RSA", "DSA", "X255"};
		JList jlAlgo = new JList(sAlgorithm);
		JSlider jsKeyStrength = new JSlider(0, 65536);
		JMenuBar jmbMainMenuBar = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiNew = new JMenuItem("New");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenu jmImportExport = new JMenu("Import/Export");
		JMenuItem jmiQuit = new JMenuItem("Quit");
		JMenuItem jmiImport = new JMenuItem("Import");
		JMenuItem jmiExport = new JMenuItem("Export");
		JButton jbCommit = new JButton("Commit");
		
		Thread.sleep(800);
		
		System.out.println("Controls created and defined");
		System.out.println("Configuring controls");
		
		bgType.add(jrbOneTimePad);
		bgType.add(jrbRepeatableKey);
		jrbOneTimePad.setSelected(true);
		jtaKey.setLineWrap(true);
		jtaKey.setWrapStyleWord(true);
		jmbMainMenuBar.add(jmFile);
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmImportExport);
		jmFile.addSeparator();
		jmFile.add(jmiQuit);
		jmImportExport.add(jmiImport);
		jmImportExport.add(jmiExport);
		jsKeyStrength.setMajorTickSpacing(32768);
		jsKeyStrength.setPaintLabels(true);
		
		Thread.sleep(800);
		
		System.out.println("Done configuring controls");
		System.out.println("Creating main panel and making it visible");
		
		JPanel jPanel = new JPanel();
		setVisible(true);
		
		Thread.sleep(1000);
		
		System.out.println("Done creating panel");
		System.out.println("Assigning controls to the panel");
		
		jPanel.add(jmbMainMenuBar);
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
		jPanel.add(jlKeyType);
		jPanel.add(jcbKeyType);
		jPanel.add(jlAlgorithm);
		jPanel.add(jlAlgo);
		jPanel.add(jlKeyStrength);
		jPanel.add(jsKeyStrength);
		jPanel.add(jbCommit);
		
		Thread.sleep(800);
		
		System.out.println("Done assigning the controls to the panel");
		System.out.println("Adding main panel to the window");
		
		Thread.sleep(1000);
		add(jPanel);
		
		System.out.println("Done adding main panel to the window");
		System.out.println("End of constructor");
	}
	
	public static void setGUI()
	{
		System.out.println("Why am I suppose to print something " +
				"here, the message won't reach");
		System.out.println("Attemting to set look and feel");
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.pluf.nymph.NymphLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println("An exception occured while trying " +
					"to set look and feel.");
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("Beginning of the entrypoint \"main\" method");
		System.out.println("Attemting to start this class");
		
		try
		{
			HCD hcd = new HCD();
		}
		catch(InterruptedException IE)
		{
			System.out.println("An interrupted exception has occured, "
					+ "trying to avoid it");
			IE.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		System.out.println("If controls are invisible try resizing the window");
		System.out.println("End of the entry point \"main\".");
	}
}
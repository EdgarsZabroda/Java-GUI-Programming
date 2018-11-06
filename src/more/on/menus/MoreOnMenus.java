package more.on.menus;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MoreOnMenus extends JFrame
{
	private static final long serialVersionUID = 0xFEEDDEADL;
	
	public MoreOnMenus()
	{
		setTitle("12. More on menus");
		setSize(384, 256);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar MenuBar = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiNew = new JMenuItem("New");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiSaveAs = new JMenuItem("Save as");
		JMenuItem jmiExit = new JMenuItem("Exit");
		JMenu jmEdit = new JMenu("Edit");
		JMenuItem jmiUndo = new JMenuItem("Undo");
		JMenuItem jmiRedo = new JMenuItem("Redo");
		JMenu jmFindOrReplace = new JMenu("Find/Replace");
		JMenuItem jmiFind = new JMenuItem("Find");
		JMenuItem jmiReplace = new JMenuItem("Replace");
		
		MenuBar.add(jmFile);
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiSaveAs);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		MenuBar.add(jmEdit);
		jmEdit.add(jmiUndo);
		jmEdit.add(jmiRedo);
		jmEdit.addSeparator();
		jmEdit.add(jmFindOrReplace);
		jmFindOrReplace.add(jmiFind);
		jmFindOrReplace.add(jmiReplace);
		
		setJMenuBar(MenuBar);
	}
	
	public static void cum()
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
		MoreOnMenus mom = new MoreOnMenus();
	}
}
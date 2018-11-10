package open.and.save;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class OpenAndSave extends JFrame
{
	private static final long serialVersionUID = 0xABCDEF90L;
	
	private static class OpenDialog implements ActionListener
	{
		private JTextField jlOpen;
		
		public OpenDialog(JTextField jltOpen)
		{
			this.jlOpen = jltOpen;
		}
		
		@Override
		public void actionPerformed(ActionEvent AE)
		{
			JFileChooser jfcOpen = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			jfcOpen.setDialogTitle("Open a file");
			
			int nChoice = jfcOpen.showOpenDialog(null);
			
			if(nChoice == JFileChooser.APPROVE_OPTION)
			{
				File openFile = jfcOpen.getSelectedFile();
				jlOpen.setText(openFile.getAbsolutePath());
			}
		}
	}
	
	private static class SaveDialog implements ActionListener
	{
		private JTextField jlSave;
		
		public SaveDialog(JTextField jtxSave)
		{
			this.jlSave = jtxSave;
		}
		
		@Override
		public void actionPerformed(ActionEvent AE)
		{
			JFileChooser jfcSave = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			jfcSave.setDialogTitle("Select where to save");
			
			int nChoice = jfcSave.showSaveDialog(null);
			
			if(nChoice == JFileChooser.APPROVE_OPTION)
			{
				File openFile = jfcSave.getSelectedFile();
				jlSave.setText(openFile.getAbsolutePath());
			}
		}
	}
	
	private static class OpenWithFilterDialog implements ActionListener
	{
		private JTextField jlOpenWithFilter;
		
		public OpenWithFilterDialog(JTextField jlfOpenWithFilter)
		{
			this.jlOpenWithFilter = jlfOpenWithFilter;
		}
		
		@Override
		public void actionPerformed(ActionEvent AE)
		{
			JFileChooser jfcOpenFiltered = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			
			jfcOpenFiltered.setDialogTitle("Open file with filter");
			
			FileNameExtensionFilter jnefJava = new FileNameExtensionFilter("Java files", "java");
			FileNameExtensionFilter jnefTxt = new FileNameExtensionFilter("Txt files", "txt");
			
			jfcOpenFiltered.addChoosableFileFilter(jnefJava);
			jfcOpenFiltered.addChoosableFileFilter(jnefTxt);
			
			int nChoice = jfcOpenFiltered.showOpenDialog(null);
			
			if(nChoice == JFileChooser.APPROVE_OPTION)
			{
				File openFile = jfcOpenFiltered.getSelectedFile();
				jlOpenWithFilter.setText(openFile.getAbsolutePath());
			}
		}
	}
	
	public OpenAndSave()
	{
		setTitle("JFileChooser");
		setSize(384, 192);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbOpen = new JButton("Open");
		JButton jbSave = new JButton("Save");
		JButton jbOpenFiltered = new JButton("Open filtered");
		JTextField jlOpen = new JTextField(10);
		JTextField jlSave = new JTextField(10);
		JTextField jlOpenWithFilter = new JTextField(10);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		setVisible(true);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 0, 0);
		jbOpen.addActionListener(new OpenDialog(jlOpen));
		jPanel.add(jlOpen, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		jPanel.add(jbOpen, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		jbSave.addActionListener(new SaveDialog(jlSave));
		jPanel.add(jlSave, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		jPanel.add(jbSave, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		jbOpenFiltered.addActionListener(new OpenWithFilterDialog(jlOpenWithFilter));
		jPanel.add(jlOpenWithFilter, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		jPanel.add(jbOpenFiltered, gbc);
		
		getContentPane().add(jPanel, BorderLayout.NORTH);
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
		OpenAndSave oas = new OpenAndSave();
	}
}
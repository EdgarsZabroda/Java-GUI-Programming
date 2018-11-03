package hello.stat.text;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StaticTextHello extends JFrame
{
	private static final long serialVersionUID = 0x8FC516DEL;
	
	public StaticTextHello()
	{
		setTitle("My first static text!!!");
		setSize(576, 256);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel JFirst = new JLabel("Yo! Hi from the static text!");
		JLabel JSecond = new JLabel("Even more static text :)");
		
		JPanel JP = new JPanel();
		setVisible(true);
		
		JP.add(JFirst);
		JP.add(JSecond);
		
		add(JP);
	}
	
	public static void GUI()
	{
		try
		{
			UIManager.setLookAndFeel("org.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		StaticTextHello STH = new StaticTextHello();
	}
}
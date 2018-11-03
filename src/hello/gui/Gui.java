// com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
package hello.gui;

import javax.swing.UIManager;
import javax.swing.JFrame;

class Gui extends JFrame
{
	private static final long serialVersionUID = 0x75FF1D28L;
	
	public Gui()
	{
		System.out.println("Inside the constructor");
		setTitle("Testing memory!!!");
		setSize(512, 256);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void FNL()
	{
		System.out.println("Inside FNL function");
		
		try
		{
			System.out.println("Trying to set Look&Feel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception E)
		{
			System.out.println("Exception occurred, read below");
			System.out.println(E.toString());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("Inside the main() function, " +
				"executing new class in which this function is");
		Gui Windows = new Gui();
		System.out.println("Passed by Testclass declaration and initialization");
	}
}
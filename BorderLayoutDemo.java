import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4;

	public BorderLayoutDemo()
	{
		setLayout(new BorderLayout());
		b1=new JButton("One");
		b2=new JButton("Two");
        b3=new JButton("Three");
		b4=new JButton("Four");
		add(b1, BorderLayout.EAST);
		add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
	}

	public static void main(String args[])
	{
		BorderLayoutDemo bd = new BorderLayoutDemo();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
	
}
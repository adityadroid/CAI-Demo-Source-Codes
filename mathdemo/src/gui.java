import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class gui extends JFrame {

	private JButton one,two;
	gui()
	{
		super("The program");
		setLayout(new FlowLayout());
		one=new JButton("BT One");
		add(one);

		Icon a= new ImageIcon(getClass().getResource("a.png"));
		Icon b= new ImageIcon(getClass().getResource("b.png"));
		two=new JButton("BT Two",a);
		two.setRolloverIcon(b);
		add(two);
		handler h=new handler();
		one.addActionListener(h);
		two.addActionListener(h);
		
		
		
		

	}
	
	private class handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			JOptionPane.showMessageDialog(null, String.format("%s",event.getActionCommand()));
			
		}
		
	}
	
}

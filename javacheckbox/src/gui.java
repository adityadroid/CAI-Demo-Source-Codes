import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class gui  extends JFrame{

	private JCheckBox bold,italic;
	private JTextField tf;
	gui(){
		super("Program");
		setLayout(new FlowLayout());
		
		tf=new JTextField("Huihuihui");
		add(tf);
		bold= new JCheckBox("Bold");
		italic=new JCheckBox("Italic");
		add(bold);
		add(italic);
		HandlerClass handler= new HandlerClass();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		
		
	}
	private class HandlerClass implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO Auto-generated method stub
			Font font=null;
			if(italic.isSelected()&&bold.isSelected())
			{
				
				font=new Font("Serif", Font.BOLD+Font.ITALIC, 16);
				
			}
			if(italic.isSelected())
			{
				
				font=new Font("Serif", Font.ITALIC, 16);
				
			}
			if(bold.isSelected())
			{
				
				font=new Font("Serif", Font.BOLD, 16);
				
			}
			else
			{
				font=new Font("Serif", Font.PLAIN, 16);

			}
			tf.setFont(font);
		}
		
	}
	

}

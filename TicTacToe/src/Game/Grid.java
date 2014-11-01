package Game;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Grid extends JButton implements ActionListener	
{	
	ImageIcon X, O;
	int val = 0;
	
	
	//Constructor that creates a singel cell in our grid.
	public Grid() 
	{
		X = new ImageIcon(this.getClass().getResource("X.jpg"));
		O = new ImageIcon(this.getClass().getResource("0.jpg"));
		
		this.addActionListener(this);
	}


	//@Override
	public void actionPerformed(ActionEvent e)
	{
		val++;
		val %=3;
		
		if(val == 0)
		{
			setIcon(null);
		}
		else if(val == 1)
		{
			setIcon(X);
		}
		else
		{
			setIcon(O);
		}
	}	
}

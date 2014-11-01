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


	@Override
	public void actionPerformed(ActionEvent e)
	{
		val++;
		val %= 3;
		int turn = 0;
		
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
		
//		while(check(turn) == false)
//		{
//			if(turn % 2 == 0)
//			{
//				setIcon(X);
//			}
//			else
//			{
//				setIcon(O);
//			}
//			turn++;
//		}
	}
}
	
//	public boolean check(int val)
//	{	
////		if()
////		{
////			return true;
////		}
////		else if()
////		{
////			
////		}
////		else if()
////		{
////			
////		}
////		else if()
////		{
////			
////		}
////		
////		else if()
////		{
////			
////		}
//		
//	}
//}

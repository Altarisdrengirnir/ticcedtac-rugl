package Game;

/*
	This is a project done by the Altaris.inc group in the
	course Software engineering at the Reykjavik University in 
	the fall of 2014.
 */
import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class tictactoe extends JFrame	
{
	JPanel p = new JPanel();
	private final int GRID = 3;
	Grid grid[][] = new Grid[GRID][GRID];
	
	public tictactoe()
	{
		super("Altaris");
		setSize(400, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(GRID, GRID));
		for(int i = 0; i < GRID ; i++)
		{
			for(int j = 0; j < GRID; j++)
			{
				grid[i][j] = new Grid();
				p.add(grid[i][j]);
			}
		}
		add(p);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new tictactoe();
	}
}

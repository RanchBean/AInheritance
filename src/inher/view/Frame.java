package inher.view;

import inher.controller.*;
import inher.view.*;
import javax.swing.JFrame;

public class Frame extends JFrame
{

	private Controller inherController;
	private Panel inherPanel;
	public Frame(Controller mainController)
	{
		this.inherController = mainController;
		inherPanel = new Panel(inherController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(inherPanel);
		this.setSize(420,420);
		this.setVisible(true);
	}
	
}

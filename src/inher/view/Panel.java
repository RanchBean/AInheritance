package inher.view;

import inher.controller.Controller;

import javax.swing.*;

import inher.view.*;


public class Panel extends JPanel
{
	private Controller inherController;
	private SpringLayout inherLayout;
	private JButton nxtButton;
	private JScrollPane textScrollBox;
	public Panel(Controller inherController) 
	{
		this.inherController = inherController;
		inherLayout = new SpringLayout();
		nxtButton = new JButton("Next");
		
		
		
	}

}

package inher.view;

import inher.controller.Controller;

import javax.swing.*;

import inher.view.*;


public class Panel extends JPanel
{
	private Controller inherController;
	private SpringLayout inherLayout;
	private JButton sortButton;
	private JScrollPane textScrollBox;
	public Panel(Controller inherController) 
	{
		this.inherController = inherController;
		inherLayout = new SpringLayout();
		sortButton = new JButton("Sort");
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupListeners() 
	{
		// TODO Auto-generated method stub
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(actionEvent click)
			{
				inherController.sortButton();
			}
		});
	
	}
	private void setupLayout() {
		// TODO Auto-generated method stub
		
	}
	private void setupPanel() {
		// TODO Auto-generated method stub
		
	}
	private void setupPane() {
		// TODO Auto-generated method stub
		
	}

}

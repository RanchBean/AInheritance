package inher.view;

import inher.controller.*;
import inher.view.*;

public class Frame 
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
		
	}
	public Controller getBaseController()
	{
		return inherController;
	}
}

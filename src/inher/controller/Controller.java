package inher.controller;
import inher.model.*;
import inher.view.*;
public class Controller 
{
	private Frame inherFrame;
	private Panel inherPanel;
	
	public Controller()
	{
		setupBirdsList();
	}
	public void start()
	{
		
	}
	private void setupBirdsList()
	{
		
	}
	private void swap(int firstLocation,int secondLocation)
	{
		Death temp = Birds.get(firstLocation);
		Birds.set(firstLocation, Birds.get(secondLocation));
		Birds.set(secondLocation,temp);
	}
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop<Birds.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (Birds.get(innerLoop-1).compareTo(Birds.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
			
		}
	}
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	private int partition(int low, int high)
	{
		int position = low;
		Death pivot = Birds.get(high);
		for(int spot = low; spot < high-1; spot++)
		{
			if(Birds.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		return position;
	}
}

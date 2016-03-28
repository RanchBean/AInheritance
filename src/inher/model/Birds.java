package inher.model;

public class Birds 
{
	private String birdName;
	private double birdHeight;
	private boolean canBirdKillHuman;
	
	public String getBirdName() 
	{
		return birdName;
	}
	public void setBirdName(String birdName) 
	{
		this.birdName = birdName;
	}
	public double getBirdHeight() 
	{
		return birdHeight;
	}
	public void setBirdHeight(double birdHeight) 
	{
		this.birdHeight = birdHeight;
	}
	public boolean getIsBirdBig() 
	{
		return canBirdKillHuman;
	}
	public void setIsBirdBig(boolean canBirdKillHuman) 
	{
		this.canBirdKillHuman = canBirdKillHuman;
	}
}

package inher.model;

public abstract class Birds implements Death
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
	public boolean getCanBirdKillHuman() 
	{
		return canBirdKillHuman;
	}
	public void setCanBirdKillHuman(boolean canBirdKillHuman) 
	{
		this.canBirdKillHuman = canBirdKillHuman;
	}

}

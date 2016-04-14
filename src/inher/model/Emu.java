package inher.model;

import javax.swing.*;

public abstract class Emu extends Birds 
{
	public Emu()
	{
		this.setBirdHeight(6.2);
		this.setBirdName("Emu");
		this.setCanBirdKillHuman(true);
	}

	@Override
	public String story() {
		// TODO Auto-generated method stub
		return "The Great Emu War of 1932 involved two Austrialian Soldiers with WWI MachineGuns and 20,000 Emu's";
	}

	@Override
	public double chanceOfDeath() 
	{
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void memes() 
	{
	
		JOptionPane.showMessageDialog(null,"Big Bird has got nothing on them.");
		
	}

	@Override
	public void spamTime(int spams) 
	{
		
	}

	@Override
	public void punch(int times) 
	{
	
	}
	
}

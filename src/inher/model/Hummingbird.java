package inher.model;

public class Hummingbird extends Birds 
{
	public Hummingbird()
	{
		this.setBirdHeight(.2);
		this.setBirdName("Hummingbird");
		this.setCanBirdKillHuman(false);
	}

	@Override
	public String story() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double chanceOfDeath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void memes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spamTime(int spams) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch(int times) {
		// TODO Auto-generated method stub
		
	}
	
}

package view;

public class InformationsDisplay {

	int healthPoints = 10;
	int playerScore = 0;
	int moneyBag = 500;		//Score
	int energyBall = 200;
	int monsterKill = 1000;
	
	public int level()
	{
		//KeyListener between 1 and 5
		return level();
	}
	
	 public boolean monsterKillScore()	// + 1000 points if a monster dies
		{
			return true;
		}
	
	public boolean moneyBagRecovery()	// + 500 points if a moneyBag is recovered
	{
		return true;
	}
	
	public boolean energyBallRecovery()		// + 200 points if energy Ball recovered
	{
		return true;
	}	
	
	
	public boolean lorannStatus() //true = alive
	{
		return true;
	}
	
	public int playerScore()		// calculate playerScore
	{
		if(energyBallRecovery() == true)
		{
			this.playerScore = playerScore + energyBall;
		}
		
		if(moneyBagRecovery() == true)
		{
			this.playerScore = playerScore + moneyBag;
		}
		if(monsterKillScore() == true)
		{
			this.playerScore = playerScore + monsterKill;
		}
		return playerScore;
	}
	
	public int healthPoints()			// - 1 health point when lorann is hit by ennemies
	{
		if(lorannStatus() == false)
		{
			this.healthPoints = healthPoints - 1;
		}
		return healthPoints;
	}
	
	
}

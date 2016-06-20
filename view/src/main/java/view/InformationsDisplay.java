package view;

public class InformationsDisplay {

	int healthPoints = 10;
	int playerScore = 0;
	int moneyBag = 500;		//Score
	int energyBall = 200;
	int monsterKill = 1000;
	
	 public boolean monsterKillScore()
		{
			return true;
		}
	
	public boolean moneyBagRecovery()
	{
		return true;
	}
	
	public boolean energyBallRecovery()
	{
		return true;
	}	
	
	
	public boolean lorannStatus() //true = alive
	{
		return true;
	}
	
	public int playerScore()
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
	
	public int healthPoints()			// - 1 hp when lorann is hit by ennemies
	{
		if(lorannStatus() == false)
		{
			this.healthPoints = healthPoints - 1;
		}
		return healthPoints;
	}
	
	
	
}

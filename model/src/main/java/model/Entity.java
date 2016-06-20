package model;

import java.awt.event.KeyEvent; // Used here for keys listener

/**
 * The Class Entity.
 *
 * @author Jean-Aymeric Diet
 */
abstract class Entity 
{

	
	public void keyTyped(KeyEvent e) {
		//Invoked when a key has been typed. 
		//This event occurs when a key press is followed by a key release.
		}
	
	int xplayer = 0;
	int yplayer = 0;
	
	public void playerMove()
	{
		
		
		// KeyListeners (d, x+32; s, y-32; q, x-32; z, y+32)
	}
	
	public int playerxLocation()
	{
		return xplayer;
	}
	
	public int playeryLocation()
	{
		return yplayer;
	}
	
	 public int playerSpeed() // playerSpeed = monsterSpeed
	{
		 int playerSpeed = 20;
		return playerSpeed;
	}

		
	public int monsterSpeed()
	{
		int monsterSpeed = 20;
		return monsterSpeed;
		
	}
	
	 public void monsterMove()		//half turn when hits a wall, follow the player when same line or same column
	{
		
	}
	 
	 public boolean monsterFirstMove()	// monsterFirstMove when lorann's First move done
		{
			
		 return true;
		}
	 
	 public boolean lorannFirstMove()
	 {
		 
		return true;
	 }
	 	 
	 	
	public void monsterHit()
	{
		
	}
	
		 
	public void snakeDoor()
	{
		
	}
	
	public void snakeHit()
	{
		
	}
	
	public void wallsHit()
	{
		
	}
	
	
}

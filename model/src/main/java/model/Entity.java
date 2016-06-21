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
	
	public int playerxLocation()	//X Location
	{
		return xplayer;
	}
	
	public int playeryLocation()	//Y location
	{
		return yplayer;
	}
	
	
	//Location used for the Monsters Hits and the IA programming 
	
	 public int playerSpeed() // playerSpeed = monsterSpeed
	{
		 int playerSpeed = 20;
		return playerSpeed;
	}

		
	public int monsterSpeed()	//monsterSpeed, same as playerSpeed
	{
		int monsterSpeed = 20;
		return monsterSpeed;
		
	}
	
	 public void monsterMove()		//half turn when hits a wall, follow the player when same line or same column
	{
		 /*Moves state by state in front of him, half turn when he hits a wall,
		 as Lorann, follows Lorann when the monster is at the same column
		 or same line*/
	}
	 
	 public boolean monsterFirstMove()	// monsterFirstMove when lorann's First move done
		{
			// Lorann's first move = first keyPressed
		 return true;
		}
	 
	 public boolean lorannFirstMove()	
	 {
		 		//First keyPressed
		return true;	
	 }
	 	 
	 	
	public void monsterHit()	//With player Location = playerLocation
	{
		
	}
	
		 
	public void snakeDoor()		//If energy ball recovered, Snake --> Door
	{
		
	}
	
	public void snakeHit()	//Location Snake = Location player, player dies
	{
		
	}
	
	public void wallsHit() 		//When PlayerLocation = Sprite location
	{
		
	}
	
	
}

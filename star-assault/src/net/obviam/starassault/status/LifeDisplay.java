package net.obviam.starassault.status;

import net.obviam.starassault.model.Life;
import net.obviam.starassault.model.Perk;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class LifeDisplay {

	private int lifesLeft;
	
	private Life[][] lifeArray;
	
	public LifeDisplay(){
		this.lifesLeft = 3;
		createArray();
	}
	
	public int getLifesLeft(){
		return this.lifesLeft;
	}
	
	public void setLifesLeft(int lifesLeft){
		this.lifesLeft = lifesLeft;
	}
	
	public void createArray(){
		int width = lifesLeft;
		int height = 1;
		
		lifeArray = new Life[height][width];
		
		for (int col = 0; col < width; col++) {
			for (int row = 0; row < height; row++) {
				lifeArray[row][col] = new Life();
			}
		}
	}
	public Life[][] getLifeArray(){
		return this.lifeArray;
	}
	
}

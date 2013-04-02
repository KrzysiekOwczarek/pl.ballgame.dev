package net.obviam.starassault.controller;

import com.badlogic.gdx.math.Vector2;

import net.obviam.starassault.model.Bob;
import net.obviam.starassault.model.Level;
import net.obviam.starassault.model.World;

public class LevelController {
	
	private World world;
	private Level level;
	private Vector2 startCoordinates;
	private Vector2 endCoordinates;
	private Bob bob;
	
	private String nextLevel = "level0.txt";
	
	public LevelController(World world){
		this.world = world;
		this.level = this.world.getLevel();
		this.bob = this.world.getBob();
		updateParams();
	}
	
	public void updateParams(){
		this.startCoordinates = this.level.getStartCoordinates();
		this.endCoordinates = this.level.getEndCoordinates();
	}
	
	public void update(float delta){
		if(Math.floor(bob.getPosition().x) == endCoordinates.x && Math.floor(bob.getPosition().y) == endCoordinates.y+1){
			level.loadDemoLevel(nextLevel);
			updateParams();
			bob.setPosition(this.startCoordinates);
		}
	}
}

package net.obviam.starassault.controller;

import net.obviam.starassault.model.Bob;
import net.obviam.starassault.model.Result;
import net.obviam.starassault.model.UI;
import net.obviam.starassault.model.World;
import net.obviam.starassault.model.Bob.State;

public class ProgressController {
	
	private World world;
	private UI ui;
	private Result result;
	private Bob bob;
	
	public ProgressController(World world, UI ui){
		this.world = world;
		this.result = this.world.getResult();
		this.ui = ui;
		this.bob = world.getBob();
	}
	
	public void update(float delta) {
		if(result.getResult() > ui.getPointsDisplay().getPointsInt()){
			this.ui.getPointsDisplay().setText(Integer.toString(this.result.getResult()));
			System.out.println(result.getResult());
		}
		
		if(Math.floor(bob.getPosition().x) == world.getLevel().getEndCoordinates().x && Math.floor(bob.getPosition().y) == world.getLevel().getEndCoordinates().y+1
				&& bob.getState().equals(State.IDLE)){
			if(ui.getLifeDisplay().getLifesLeft() > 0){
				ui.getLifeDisplay().setLifesLeft(ui.getLifeDisplay().getLifesLeft()-1);
				ui.getLifeDisplay().createArray();
			}
		}
	}
}

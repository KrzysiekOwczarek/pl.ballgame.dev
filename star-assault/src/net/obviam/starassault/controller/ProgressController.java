package net.obviam.starassault.controller;

import net.obviam.starassault.model.Result;
import net.obviam.starassault.model.UI;
import net.obviam.starassault.model.World;

public class ProgressController {
	
	private World world;
	private UI ui;
	private Result result;
	
	public ProgressController(World world, UI ui){
		this.world = world;
		this.result = this.world.getResult();
		this.ui = ui;
	}
	
	public void update(float delta) {
		if(result.getResult() > ui.getPointsDisplay().getPointsInt()){
			this.ui.getPointsDisplay().setText(Integer.toString(this.result.getResult()));
			System.out.println(result.getResult());
		}
	}
}

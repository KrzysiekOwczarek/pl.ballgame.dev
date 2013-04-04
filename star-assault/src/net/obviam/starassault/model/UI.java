package net.obviam.starassault.model;

import net.obviam.starassault.status.LifeDisplay;
import net.obviam.starassault.status.PointsDisplay;

public class UI {
	
	private PointsDisplay pointsDisplay;
	private LifeDisplay lifeDisplay;
	
	public UI(){
		createUI();
	}
	
	public void createUI(){
		pointsDisplay = new PointsDisplay();
		lifeDisplay = new LifeDisplay();
	}
	
	public PointsDisplay getPointsDisplay(){
		return pointsDisplay;
	}
	
	public LifeDisplay getLifeDisplay(){
		return lifeDisplay;
	}
}

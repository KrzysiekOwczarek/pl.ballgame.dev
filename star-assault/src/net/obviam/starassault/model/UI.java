package net.obviam.starassault.model;

import net.obviam.starassault.status.PointsDisplay;

public class UI {
	
	private PointsDisplay pointsDisplay;
	
	public UI(){
		createUI();
	}
	
	public void createUI(){
		pointsDisplay = new PointsDisplay();
	}
	
	public PointsDisplay getPointsDisplay(){
		return pointsDisplay;
	}
}

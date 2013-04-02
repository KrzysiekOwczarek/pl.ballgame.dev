package net.obviam.starassault.status;

public class PointsDisplay {
	
	private String textToDisplay;
	
	private float textWidth;
	private float textHeight;
	
	public PointsDisplay(){
		textToDisplay = "0";
	}
	
	public float getWidth(){
		return this.textWidth;
	}
	
	public float getHeight(){
		return this.textHeight;
	}
	
	public void setText(String text){
		textToDisplay = text;
		//textWidth = font.getBounds(textToDisplay).width;
		//textHeight = font.getBounds(textToDisplay).height;
	}
	
	public String getPointsString(){
		return textToDisplay;
	}
	
	public int getPointsInt(){
		return Integer.parseInt(textToDisplay);
	}
}

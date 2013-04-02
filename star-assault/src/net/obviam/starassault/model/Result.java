package net.obviam.starassault.model;

public class Result {
	
	private int result;
	
	public Result(){
		this.result = 0;
	}
	
	public void addPoints(float points){
		this.result += points;
	}
	
	public void writePoints(){
		System.out.println(this.result);
	}
	
	public int getResult(){
		return this.result;
	}
}

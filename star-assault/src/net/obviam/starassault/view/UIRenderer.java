package net.obviam.starassault.view;

import net.obviam.starassault.model.Life;
import net.obviam.starassault.model.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class UIRenderer {
	
	private UI ui;
	private SpriteBatch spriteBatch;
	private Texture lifeTexture;
	private BitmapFont font;
	
	public UIRenderer(UI ui){
		this.ui = ui;
		spriteBatch = new SpriteBatch();
		font = new BitmapFont();
		loadTextures();
	}
	
	public void loadTextures(){
		//tileTexture = new Texture(Gdx.files.internal("images/tile.png"));
		lifeTexture = new Texture(Gdx.files.internal("images/pacman.png"));
	}
	
	public void render(){
		spriteBatch.begin();
			font.draw(spriteBatch, ui.getPointsDisplay().getPointsString(), 80, 80);
			drawLifes();
		spriteBatch.end();
	}
	
	public void drawLifes(){
		//System.out.println(ui.getLifeDisplay().getLifeArray().length);
		for (int i = 0; i < ui.getLifeDisplay().getLifeArray()[0].length; i++){
			spriteBatch.draw(lifeTexture, i*40, 0, Life.SIZE *20, Life.SIZE * 20);
		}
	}
}

package net.obviam.starassault.view;

import net.obviam.starassault.model.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class UIRenderer {
	
	private UI ui;
	private SpriteBatch spriteBatch;
	private Texture tileTexture;
	private BitmapFont font;
	
	public UIRenderer(UI ui){
		this.ui = ui;
		spriteBatch = new SpriteBatch();
		font = new BitmapFont();
		loadTextures();
	}
	
	public void loadTextures(){
		tileTexture = new Texture(Gdx.files.internal("images/tile.png"));
	}
	
	public void render(){
		spriteBatch.begin();
			font.draw(spriteBatch, ui.getPointsDisplay().getPointsString(), 80, 80);
		spriteBatch.end();
	}
	
	public void drawPointsDisplay(){
		//font.draw(spriteBatch, "test", 0, 0);
	}
}

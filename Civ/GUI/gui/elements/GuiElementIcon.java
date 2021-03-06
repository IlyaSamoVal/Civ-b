package gui.elements;

import java.awt.Graphics;

import javax.media.opengl.GL3;

import gui.GuiElement;

public class GuiElementIcon extends GuiElement {

	public GuiElementIcon(String title) {
		super(title);
	}

	@Override
	public void draw(Graphics g, long tic) {
		if(visible){
			if(selected){
				g.drawImage(textureSelected, drawX, drawY, sizeX, sizeY, null);
			}
			else{
				g.drawImage(textureNormal, drawX, drawY, sizeX, sizeY, null);
			}
		}
	}

	@Override
	public void draw(GL3 gl) {

	}
}

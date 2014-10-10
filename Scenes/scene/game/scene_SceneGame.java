package scene.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.media.opengl.GL3;

import misc.Enums;
import misc.Environment;
import scene.Scene;
import scenedata.game.GameData;

public class scene_SceneGame extends Scene {
	
	protected GameData gamedata;
	
	public scene_SceneGame(GameData gamedata){
		super(Enums.Scene.GAME, new data_SceneGame(gamedata));
		this.gamedata = gamedata;
	}

	@Override
	public void draw(Graphics g) {
		gamedata.map.draw(g);
		
		g.setColor(Color.white);
		g.drawString("Game scene", 0, 10);
		g.drawString("Camera x: " +Environment.cameraX + " y: " + Environment.cameraY , 0, 20);
		g.drawString("Node selected x: " +Environment.nodeSelectedX + " y: " + Environment.nodeSelectedY , 0, 30);
		g.drawString("Node draw x: " +Environment.nodeDrawCursorX + " y: " + Environment.nodeDrawCursorY , 0, 40);
	}

	@Override
	public void draw(GL3 gl) {
		
	}
}

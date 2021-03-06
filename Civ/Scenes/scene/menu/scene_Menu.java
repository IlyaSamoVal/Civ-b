package scene.menu;

import java.awt.Color;
import java.awt.Graphics;

import javax.media.opengl.GL3;

import misc.Const;
import misc.Enums;
import misc.Environment;
import misc.ToolsConst;
import recources.Recources;
import scene.Scene;

public class scene_Menu extends Scene {
	
	public scene_Menu(){
		super(Enums.Scene.MENU, new scenedata_Menu());
	}

	@Override
	public void draw(Graphics g, long tic) {
		g.drawImage(Recources.getImage(Const.imgMenu), 0, 0, Environment.frameSizeX, Environment.frameSizeY, null);
		
		g.setColor(Color.white);
		g.drawString("" + Const.title + " v" + ToolsConst.version + "." + ToolsConst.subVersion, 0, 10);
		g.drawString("2014 (c) Leo di Grigio and Sivalent", 0, 20);
		g.drawString("Scene: Menu", 0, 30);
	}

	@Override
	public void draw(GL3 gl) {
		
	}
}
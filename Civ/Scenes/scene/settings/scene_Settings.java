package scene.settings;

import java.awt.Color;
import java.awt.Graphics;

import javax.media.opengl.GL3;

import misc.Const;
import misc.Enums;
import misc.Environment;
import recources.Recources;
import scene.Scene;

public class scene_Settings extends Scene {

	public scene_Settings() {
		super(Enums.Scene.SETTINGS, new scenedata_Settings());
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Recources.getImage(Const.imgMenu), 0, 0, Environment.frameSizeX, Environment.frameSizeY, null);
		
		g.setColor(Color.white);
		g.drawString("" + Const.title + " v" + Const.version + "." + Const.subVersion, 0, 10);
		g.drawString("2014 (c) Leo di Grigio and Sivalent", 0, 20);
		g.drawString("Scene: Settings", 0, 30);
	}

	@Override
	public void draw(GL3 gl) {

	}
}

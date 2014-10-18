package recources;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;

import recources.nongl.Tile;
import misc.Enums;
import misc.Log;

public class Recources {
	
	private static Assets assets;
	
	public Recources(Enums.RenderMode mode) throws FontFormatException, IOException{
		Log.msg("Recources loaded " + mode);
		
		switch(mode){
			case NATIVE:
				assets = new AssetsNative();
				break;
			
			case OPENGL:
				assets = new AssetsGL();
				break;
			
			default:
				assets = null;
				Log.err("Assets is not avaible");
				System.exit(0);
				break;
		}
		
		assets.init();
	}
	
	public static Image getImage(String name){
		return assets.getImage(name);
	}
	
	public static void addImage(String name, Tile tile){
		assets.addImage(name, tile);
	}

	public static void setCursor(String name) {
		assets.setCursor(name);
	}

	public static Font getFont() {
		return assets.getFont();
	}
}

package script.gui;

import misc.Log;
import gui.GUI;

public class gui_ElementClick extends ScriptGui {

	public static void execute(GUI gui) {
		Log.debug("�xecute gui_ElementClick");
		
		if(!gui.click()){
			
		}
	}
}

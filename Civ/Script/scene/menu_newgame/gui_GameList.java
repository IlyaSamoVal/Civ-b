package scene.menu_newgame;

import gui.elements.GuiElementGamesList;

import java.io.IOException;

import misc.Environment;
import misc.Log;
import script.gui.ScriptGui;
import tasks.Task;

public class gui_GameList extends ScriptGui {
	
	@Override
	public void execute(Task task) throws IOException {
		Log.debug("Execute gui_GameList");
		
		GuiElementGamesList list = (GuiElementGamesList)task.data;
		
		if(list != null){
			int x = Environment.mouseX;
			int y = Environment.mouseY;
			
			if(x > list.getDrawX() + 10 && x < list.getDrawX() + list.getSizeX() - 20 &&
			   y > list.getDrawY() + 5  && y < list.getDrawY() + list.getSizeY() - 20)
			{
				int line = (y - (list.getDrawY() + 5)) / list.getLineSize();
				list.select(line);
			}
		}
	}
}

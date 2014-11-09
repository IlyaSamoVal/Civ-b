package script.userapi;

import java.awt.event.KeyEvent;

import misc.Enums;
import painter.Painter;
import tasks.Task;

public class api_KeyPressed extends ScriptApi {

	public static void execute(KeyEvent event) {
		Painter.addTask(new Task(Enums.Task.KEYBOARD_PRESSED, event));
	}
}
